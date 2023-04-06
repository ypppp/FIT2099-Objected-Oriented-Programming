package main.controllers;

import main.models.purchases.Purchase;

import java.util.ArrayList;

/**
 * @author Yee Perng Yew
 * @version 1
 * @see Purchase, ArrayList
*/


public class PurchaseManager {


    /**
     *
     */
    private ArrayList<Purchase> purchases = new ArrayList<>();

    private static PurchaseManager purchaseManager;

    /**
     *
     */

    private PurchaseManager(){

    }

    /**
     *
     * @return
     */

    public static PurchaseManager getInstance(){
        purchaseManager = new PurchaseManager();

        return purchaseManager;
    }

    /**
     *
     * @param devices
     * @param data
     */

    public void makePurchase(IData devices, Purchase data) {
        if (devices.isDeviceAvailable(data.getDeviceID())){
            purchases.add(data);
        }
    }

    /**
     *
     */

    public void printPurchases() {
        for (Purchase purchs: purchases) {
            System.out.println("P-ID: " + purchs.getPurchaseID() + " | C-ID: " + purchs.getCustomerID() + " | D-ID: " + purchs.getDeviceID() + " | Date: " + purchs.getDate() + " | Type: " + purchs.getType());

        }

    }
}
