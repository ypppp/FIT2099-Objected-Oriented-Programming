package main.models;

import main.utils.PurchaseType;

public class InStorePurchase extends Purchase {

    private String storeLocation;

    public InStorePurchase(int customerID, int deviceID, String date, String storeLocation) {
        super(customerID, deviceID, date, PurchaseType.IN_STORE);
        this.storeLocation = storeLocation;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }
}
