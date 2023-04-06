package main;

import main.controllers.PurchaseManager;
import main.controllers.Store;
import main.utils.MenuManagerAdmin;
import main.utils.MenuManagerEmployee;

import java.util.Scanner;

/**
 * @author Yee Perng Yew
 * @version 1
 * @see PurchaseManager, Store, MenuManagerAdmin, MenuManagerEmployee
 */

public class BazarDriver {
    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {
//        PurchaseManager purchaseManager = new PurchaseManager();
        PurchaseManager purchaseManager = PurchaseManager.getInstance();
//        MenuManagerAdmin menuManagerAdmin = new MenuManagerAdmin();
        MenuManagerAdmin menuManagerAdmin = MenuManagerAdmin.getInstance();
        MenuManagerEmployee menuManagerEmployee = MenuManagerEmployee.getInstance();
//        Store store = new Store(purchaseManager, menuManagerAdmin);
        Store store = Store.getInstance(purchaseManager, menuManagerAdmin);
        store.runBazar();


    }

}