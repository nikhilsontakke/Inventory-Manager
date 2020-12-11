/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanager;

/**
 *
 * @author nikhi
 */
public class InventoryManager {

    /**
     * @param args the command line arguments
     */
    String lname;
    String lusername;
    String lcompany;
    public static void main(String[] args) {
        // TODO code application logic here
        
        login info=new login();
        info.setVisible(true);
    }
}
