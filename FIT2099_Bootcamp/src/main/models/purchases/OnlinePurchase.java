package main.models.purchases;

import main.utils.PurchaseType;
import main.utils.Utils;

/**
 * @author Yee Perng Yew
 * @version 1
 * @see Utils, PurchaseType
 */
public class OnlinePurchase extends Purchase {

    private String delAddress; // a variable named delAddress with string type

    /**
     *
     * @param customerID
     * @param deviceID
     * @param date
     * @param aDelAddress
     * @throws Exception
     */
    public OnlinePurchase(int customerID, int deviceID, String date, String aDelAddress) throws Exception{
        super(customerID, deviceID, date, PurchaseType.ONLINE);
        if (setDelAddress(aDelAddress)) {
            setDelAddress(aDelAddress);
        }else{
            throw new Exception("Incorrect delivery details ");
        }
    }

    /**
     *
     * @return
     */
    public String getDelAddress() {
        return delAddress;
    }

    /**
     *
     * @param aDelAddress
     * @return
     */
    public boolean setDelAddress(String aDelAddress) {
        boolean isValid=false;

        if(Utils.verifyString(aDelAddress,5,20)){
            isValid=true;

            delAddress = aDelAddress;
        }
        return (isValid);
    }
}
