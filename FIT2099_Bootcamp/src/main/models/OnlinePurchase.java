package main.models;

import main.utils.PurchaseType;

public class OnlinePurchase extends Purchase{

    private String delAddress;

    public OnlinePurchase(int customerID, int deviceID, String date, String delAddress) {
        super(customerID, deviceID, date, PurchaseType.ONLINE);
        this.delAddress = delAddress;
    }

    public String getDelAddress() {
        return delAddress;
    }

    public void setDelAddress(String delAddress) {
        this.delAddress = delAddress;
    }
}
