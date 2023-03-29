package main.models;

import main.utils.Utils;

public class Printer extends Device{
    private int ppm;
    private static final int ID_MIN = 100;
    private static final int ID_MAX = 999;


    public Printer(String name, String description, int ppm) {
        super(name, description);
        this.ppm = ppm;
        setId(generateId());
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
        return "ID: " + super.getId() + " Type: main.models.Printer | " + super.toString() + " | PPM: " + getPpm();

    }
}
