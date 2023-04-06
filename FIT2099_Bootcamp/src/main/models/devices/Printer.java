package main.models.devices;

import main.utils.Utils;
/**
 * @author Yee Perng Yew
 * @version 1
 * @see Utils
 */

public class Printer extends Device {


    private int ppm; // a variable named ppm of int type
    private static final int ID_MIN = 100; // a final min for generateID
    private static final int ID_MAX = 999; // a final max for generateID

    /**
     *
     * @param name
     * @param description
     * @param aPpm
     * @throws Exception
     */
    public Printer(String name, String description, int aPpm) throws Exception{
        super(name, description);
            if (setPpm(aPpm)) {
                setPpm(aPpm);
            }else{
                throw new Exception("Incorrect ppm details ");
            }
        setId(generateId());
    }

    /**
     *
     * @return
     */
    public int getPpm() {
        return ppm;
    }

    /**
     *
     * @param aPpm
     * @return
     */
    public boolean setPpm(int aPpm) {
        boolean isValid=false;

        if(Utils.verifyInt(aPpm,1,50)){
            isValid=true;

            ppm = aPpm;
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
        return "ID: " + super.getId() + " Type: main.models.devices.Printer | " + super.toString() + " | PPM: " + getPpm();

    }
}
