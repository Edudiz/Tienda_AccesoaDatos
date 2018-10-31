/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class ComboItem {
    
    private List<String> list;

    public ComboItem(List<String> list) {
        this.list = list;
    }

    public ComboItem() {
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ComboItem = " + list;
    }

}
