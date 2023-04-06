package main.models.devices;

import main.utils.Utils;

/**
 * @author Yee Perng Yew
 * @version 1
 * @see Utils
 */
public class Computer extends Device {

    private String manufacturer; // A manufacturer variable of string type;
    private static final int ID_MIN = 100000;  // A final int min for generateID
    private static final int ID_MAX = 9999999; // A final int max for generateID

    /**
     *
     * @param name
     * @param description
     * @param aManufacturer
     * @throws Exception
     */

    public Computer(String name, String description, String aManufacturer) throws Exception{
        super(name, description);
        if (setManufacturer(aManufacturer)) {
            setManufacturer(aManufacturer);
        }else{
            throw new Exception("Incorrect manufacturer details ");
        }
        setId(generateId());
    }

    /**
     *
     * @return
     */

    public String getManufacturer() {
        return manufacturer;
    }

    /**
     *
     * @param aManufacturer
     * @return
     */
    public boolean setManufacturer(String aManufacturer) {
        boolean isValid=false;

        if(Utils.verifyString(aManufacturer,3,15)){
            isValid=true;

            manufacturer = aManufacturer;
        }
        return (isValid);
    }

    /**
     *
     * @return
     */
    @Override
    public int generateId() {
        return Utils.nextID(ID_MIN,ID_MAX);
    }

    /**
     *
     * @return
     */

    @Override
    public String toString() {
        return "ID: " + super.getId() + " Type: main.models.devices.Computer | " + super.toString() + " | manufacturer: " + getManufacturer();
    }
}
