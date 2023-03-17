public class Printer extends Device{
    private int ppm;
    private static final int ID_MIN = 100;
    private static final int ID_MAX = 999;


    public Printer(String name, String description, int ppm) {
        super(name, description);
        this.ppm = ppm;
    }

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    @Override
    public int generateId() {
        return Utils.nextID(ID_MIN,ID_MAX);
    }

    @Override
    public String toString() {
        return "ID: " + generateId() + " Type: Printer | " + super.toString() + " | PPM: " + getPpm();

    }
}
