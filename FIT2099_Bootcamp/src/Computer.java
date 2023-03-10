public class Computer extends Device{
    private String manufacturer;

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
    public String toString() {
        return "Type: Computer | " + super.toString() + " | manufacturer: " + getManufacturer();
    }
}
