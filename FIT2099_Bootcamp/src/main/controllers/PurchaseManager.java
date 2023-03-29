package main.controllers;

import main.models.Computer;
import main.models.Purchase;

import java.util.ArrayList;

public class PurchaseManager {

    private ArrayList<Purchase> purchases = new ArrayList<>();

    public void makePurchase(IData devices, Purchase data) {
        if (devices.isDeviceAvailable(data.getDeviceID())){
            purchases.add(data);
        }
    }

    public void printPurchases() {
        for (Purchase purchs: purchases) {
            System.out.println("P-ID: " + purchs.getPurchaseID() + " | C-ID: " + purchs.getCustomerID() + " | D-ID: " + purchs.getDeviceID() + " | Date: " + purchs.getDate() + " | Type: " + purchs.getType());

        }

    }
}
