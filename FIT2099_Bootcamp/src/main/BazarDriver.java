package main;

import main.controllers.PurchaseManager;
import main.controllers.Store;
import main.models.Purchase;
import main.utils.MenuInput;

public class BazarDriver {
    public static void main(String args[]) {
        PurchaseManager purchaseManager = new PurchaseManager();
        MenuInput menuInput = new MenuInput();
        Store store = new Store(purchaseManager, menuInput);
        store.runBazar();


    }

}