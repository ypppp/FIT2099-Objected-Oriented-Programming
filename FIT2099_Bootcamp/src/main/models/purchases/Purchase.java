package main.models.purchases;

import main.utils.PurchaseType;
import main.utils.Utils;
/**
 * @author Yee Perng Yew
 * @version 1
 * @see Utils, PurchaseType
 */
public abstract class Purchase {


    private int purchaseID; // a variable purchaseID with int type
    private int customerID; // a variable customerID with int type
    private int deviceID; // a variable device with int type
    private String date; // a variable date with string type
    private static final int ID_MIN = 100; // a variable for the min for generateID
    private static final int ID_MAX = 999; // a variable for the max for generateID
    private PurchaseType type; // a variable named type with a PurchaseType

    /**
     *
     * @param customerID
     * @param deviceID
     * @param aDate
     * @param type
     * @throws Exception
     */

    public Purchase(int customerID, int deviceID, String aDate, PurchaseType type) throws Exception{
        this.customerID = customerID;
        this.deviceID = deviceID;
        if (setDate(aDate)) {
            setDate(aDate);
        }else{
            throw new Exception("Incorrect Purchase Date ");
        }
        setDate(aDate);
        setPurchaseID(Utils.nextID(ID_MIN,ID_MAX));
        this.type = type;

    }

    /**
     *
     * @return
     */
    public int getPurchaseID() {
        return purchaseID;
    }

    /**
     *
     * @param purchaseID
     */
    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    /**
     *
     * @return
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     *
     * @param customerID
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     *
     * @return
     */
    public int getDeviceID() {
        return deviceID;
    }

    /**
     *
     * @param deviceID
     */
    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    /**
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param aDate
     * @return
     */
    public boolean setDate(String aDate) {
        boolean isValid=false;
        if(aDate.length()==8){
            isValid=true;
            date = aDate;
        }
        return (isValid);
    }

    /**
     *
     * @return
     */
    public PurchaseType getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(PurchaseType type) {
        this.type = type;
    }

}


