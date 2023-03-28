package main.models;

import main.utils.PurchaseType;
import main.utils.Utils;

public abstract class Purchase {

    private int purchaseID;
    private int customerID;
    private int deviceID;
    private String date;
    private static final int ID_MIN = 100;
    private static final int ID_MAX = 999;
    private PurchaseType type;

    public Purchase(int customerID, int deviceID, String date, PurchaseType type) {
        this.customerID = customerID;
        this.deviceID = deviceID;
        this.date = date;
        setPurchaseID(Utils.nextID(ID_MIN,ID_MAX));
        this.type = type;

    }

    public int getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PurchaseType getType() {
        return type;
    }

    public void setType(PurchaseType type) {
        this.type = type;
    }

}


