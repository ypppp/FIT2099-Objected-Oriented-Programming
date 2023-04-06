package main.models.devices;

import main.utils.Utils;

/**
 * @author Yee Perng Yew
 * @version 1
 * @see
 */

public abstract class Device {


    private String name; // A variable named name with string type
    private String description; // A variable named description named string type
    private int id; // A variable named id of int type

    /**
     *
     * @param aName
     * @param aDescription
     * @throws Exception
     */
    public Device(String aName, String aDescription) throws Exception{
        if (setName(aName) && setDescription(aDescription)){
            setName(aName);
            setDescription(aDescription);
        }else{
            throw new Exception("Incorrect device details ");
        }

        this.setId(generateId());
    }

    /**
     *
     * @return
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @param aName
     * @return
     */

    public boolean setName(String aName) {
        boolean isValid=false;

        if(Utils.verifyString(aName,3,15)){
            isValid=true;

            name = aName;
        }
        return (isValid);
    }

    /**
     *
     * @return
     */

    public String getDescription() {
        return description;
    }

    /**
     *
     * @param aDescription
     * @return
     */

    public boolean setDescription(String aDescription) {
        boolean isValid=false;

        if(Utils.verifyString(aDescription,5,20)){
            isValid=true;

            description = aDescription;
        }
        return (isValid);
    }

    /**
     *
     * @return
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */

    public abstract int generateId();

    /**
     *
     * @return
     */
    public String toString(){
        String ret = "";

        ret += "name: " + getName() + " | description: " + getDescription();
        return ret;
    }
}
