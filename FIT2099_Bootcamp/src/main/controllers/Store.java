package main.controllers;

import java.util.ArrayList;
import java.util.Scanner;
import main.models.*;
import main.utils.MenuInput;
import main.utils.PurchaseType;

public class Store implements IData{
    private ArrayList<Computer> computers;
    private ArrayList<Printer> printers;
    private PurchaseManager purchaseManagers;
    private MenuInput menuInputs;

    public Store(PurchaseManager purchaseManagers, MenuInput menuInputs) {
        this.computers = new ArrayList<>();
        this.printers = new ArrayList<>();
        this.purchaseManagers = purchaseManagers;
        this.menuInputs = menuInputs;
    }


    public void createComputers(){
        String name, description, manufacture;
        Scanner sel = new Scanner(System.in);
        System.out.print("Enter main.models.Device Name:");
        name = sel.nextLine();
        System.out.print("Enter main.models.Device Description:");
        description = sel.nextLine();
        System.out.print("Enter main.models.Computer Manufacture: ");
        manufacture = sel.next();
        Computer aComputer = new Computer(name, description, manufacture);
        computers.add(aComputer);
    }

    public void createPrinters(){
        String name, description;
        int ppm;
        Scanner sel = new Scanner(System.in);
        System.out.print("Enter main.models.Device Name:");
        name = sel.nextLine();
        System.out.print("Enter main.models.Device Description:");
        description = sel.nextLine();
        System.out.print("Enter main.models.Printer PPM: ");
        ppm = Integer.parseInt(sel.next());
        Printer aPrinter = new Printer(name, description, ppm);
        printers.add(aPrinter);

    }

    public void createPurchase(){
        String date, delAddress, storeLocation;
        int Cid, Did;
        int type;
        Scanner sel = new Scanner(System.in);
        System.out.print("Enter Customer Id:");
        Cid = Integer.parseInt(sel.nextLine());
        System.out.print("Enter Device Id: ");
        Did = Integer.parseInt(sel.next());
        System.out.print("Enter Date: ");
        date = sel.next();
        System.out.print("Enter purchase type: ");
        type = Integer.parseInt((sel.next()));
        if (type == 0){
            System.out.print("Enter Delivery Address: ");
            delAddress = sel.next();
            OnlinePurchase onPurch = new OnlinePurchase(Cid, Did, date, delAddress);
            purchaseManagers.makePurchase(this, onPurch);
        }
        if (type == 1){
            System.out.print("Enter Store Location: ");
            storeLocation = sel.next();
            InStorePurchase InPurch = new InStorePurchase(Cid, Did, date, storeLocation);
            purchaseManagers.makePurchase(this, InPurch);

        }



    }



    public void printComputers(){
        for (int i = 0; i < this.computers.size(); i++){
            System.out.println("main.models.Computer (" + (i+1) + ") " + this.computers.get(i));

        }

    }
    public void printPrinters() {
        for (int i = 0; i < this.printers.size(); i++) {
            System.out.println("main.models.Printer (" + (i + 1) + ") " + this.printers.get(i));

        }
    }

    public void runBazar(){
//        initStore();
//        createComputers();
//        createPrinters();
//        printComputers();
//        printPrinters();
        int selection;
        do {
            selection = menuInputs.menuItem();
            switch (selection) {
                case 1:
                    createComputers();
                    break;
                case 2:
                    createPrinters();
                    break;
                case 3:
                    createPurchase();
                    break;
                case 4:
                    printComputers();
                    break;
                case 5:
                    printPrinters();
                    break;
                case 6:
                    purchaseManagers.printPurchases();
                    break;
                case 7:
                    System.exit(0);
            }
        } while (selection != 7);
    }



    @Override
    // to check if the id given by the user matches one of the existing devices
    public boolean isDeviceAvailable(int id) {
        for (Computer comp: computers) {
            if (id == comp.getId()) {
                return true;
            }
        }

        for (Printer prin: printers) {
            if (id == prin.getId()) {
                return true;
            }
        }
        return false;


    }
}


