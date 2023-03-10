public class Store {
    private Computer[] computers;
    private Printer[] printers;

    public void initStore(int computers, int printers){
        this.computers = new Computer[computers];
        this.printers = new Printer[printers];

    }

    public void createComputers(){
        computers[0] = new Computer("XPS", "Laptop 16 inch", "Dell");
        computers[1] = new Computer("iMac", "Desktop 27 inch", "Apple");
        computers[2] = new Computer("Thinkpad", "Laptop 14 inch", "Lenovo");
    }

    public void createPrinters(){
        printers[0] = new Printer("Mono Printer", "Ink-jet Printer", 10);
        printers[1] = new Printer("Multi Function", "Laser Printer", 10);

    }

    public void printComputers(){
        for (int i = 0; i < this.computers.length; i++){
            System.out.println("Computer (" + (i+1) + ") " + this.computers[i]);

        }

    }
    public void printPrinters() {
        for (int i = 0; i < this.printers.length; i++) {
            System.out.println("Printer (" + (i + 1) + ") " + this.printers[i]);

        }
    }

    public void runBazar(){
        initStore(3, 2);
        createComputers();
        createPrinters();
        printComputers();
        printPrinters();
    }

}
