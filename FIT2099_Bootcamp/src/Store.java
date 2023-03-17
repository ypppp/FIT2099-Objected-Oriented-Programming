import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList<Computer> computers;
    private ArrayList<Printer> printers;

    public void initStore(){
        computers = new ArrayList<>();
        printers = new ArrayList<>();
    }

    public void createComputers(){
        String name, description, manufacture;
        Scanner sel = new Scanner(System.in);
        System.out.print("Enter Device Name:");
        name = sel.nextLine();
        System.out.print("Enter Device Description:");
        description = sel.nextLine();
        System.out.print("Enter Computer Manufacture: ");
        manufacture = sel.next();
        Computer aComputer = new Computer(name, description, manufacture);
        computers.add(aComputer);
    }

    public void createPrinters(){
        String name, description;
        int ppm;
        Scanner sel = new Scanner(System.in);
        System.out.print("Enter Device Name:");
        name = sel.nextLine();
        System.out.print("Enter Device Description:");
        description = sel.nextLine();
        System.out.print("Enter Printer PPM: ");
        ppm = Integer.parseInt(sel.next());
        Printer aPrinter = new Printer(name, description, ppm);
        printers.add(aPrinter);

    }

    public void printComputers(){
        for (int i = 0; i < this.computers.size(); i++){
            System.out.println("Computer (" + (i+1) + ") " + this.computers.get(i));

        }

    }
    public void printPrinters() {
        for (int i = 0; i < this.printers.size(); i++) {
            System.out.println("Printer (" + (i + 1) + ") " + this.printers.get(i));

        }
    }

    public void runBazar(){
        initStore();
        createComputers();
        createPrinters();
        printComputers();
        printPrinters();
    }

}
