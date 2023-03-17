public class Computer extends Device{
    private String manufacturer;
    private static final int ID_MIN = 100000;
    private static final int ID_MAX = 9999999;

    public Computer(String name, String description, String manufacturer) {
        super(name, description);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public int generateId() {
        return Utils.nextID(ID_MIN,ID_MAX);
    }

    @Override
    public String toString() {
        return "ID: " + generateId() + " Type: Computer | " + super.toString() + " | manufacturer: " + getManufacturer();
    }
}
