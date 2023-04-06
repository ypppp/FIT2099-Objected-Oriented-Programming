package main.models.purchases;

import main.utils.PurchaseType;
import main.utils.Utils;

/**
 * @author Yee Perng Yew
 * @version 1
 * @see Utils, PurchaseType
 */

public class InStorePurchase extends Purchase {

    private String storeLocation; // A variable named storeLocation with string type

    /**
     *
     * @param customerID
     * @param deviceID
     * @param date
     * @param aStoreLocation
     * @throws Exception
     */

    public InStorePurchase(int customerID, int deviceID, String date, String aStoreLocation) throws Exception{
        super(customerID, deviceID, date, PurchaseType.IN_STORE);
        if (setStoreLocation(aStoreLocation)) {
            setStoreLocation(aStoreLocation);
        }else{
            throw new Exception("Incorrect store location details ");
        }
    }

    /**
     *
     * @return
     */
    public String getStoreLocation() {
        return storeLocation;
    }

    /**
     *
     * @param aStoreLocation
     * @return
     */

    public boolean setStoreLocation(String aStoreLocation) {
        boolean isValid = false;

        if (Utils.verifyString(aStoreLocation,3,10)) {
            isValid = true;

            storeLocation = aStoreLocation;
        }
        return (isValid);
    }
}

