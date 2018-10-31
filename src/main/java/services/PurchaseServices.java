/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DaoPurchases;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PurchaseServices {
    
     public List<String> getAllCompras() {
        DaoPurchases dao = new DaoPurchases();
        return dao.getAllPurchases();
    }

    public List<String> getComprasPorFecha(LocalDate fecha) {
        DaoPurchases dao = new DaoPurchases();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        List<String> lineas;
        List<String> filtradas;
        lineas = dao.getAllPurchases();
        String[] partes;
        
        if (fecha != null) {
            filtradas = new LinkedList<>();
            for (String i : lineas) {
                partes = i.split(";");
                if (fecha.format(formatter).equals(partes[2])) {
                    filtradas.add(i);
                }
            }
        } else {
            filtradas = lineas;
        }
        return filtradas;
    }

    public boolean addPurchase(String nif, String idArticle, String select, LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String line = nif + ";" + idArticle + ";" +select+ ";"+ date.format(formatter);
        DaoPurchases dao = new DaoPurchases();
        return dao.addPurchases(line);
    }

    public boolean deletePurchase(String line) {
        DaoPurchases dao = new DaoPurchases();
        List<String> purchase = dao.getAllPurchases();
        purchase.remove(line);
        return dao.saveAllPurchases(purchase);
    }
    
}
