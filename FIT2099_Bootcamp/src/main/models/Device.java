package main.models;

public abstract class Device {

    private String name;
    private String description;
    private int id;

    public Device(String name, String description) {
        this.name = name;
        this.description = description;
        this.setId(generateId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract int generateId();

    public String toString(){
        String ret = "";

        ret += "name: " + getName() + " | description: " + getDescription();
        return ret;
    }
}
