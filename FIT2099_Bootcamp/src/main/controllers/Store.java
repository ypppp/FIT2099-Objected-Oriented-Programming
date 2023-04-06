package main.controllers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import main.models.devices.Computer;
import main.models.devices.Printer;
import main.models.purchases.InStorePurchase;
import main.models.purchases.OnlinePurchase;
import main.utils.IMenuManager;
import main.utils.MenuManagerAdmin;
import main.utils.Utils;

/**
 * @author Yee Perng Yew
 * @version 1
 * @see Computer, Printer, InstorePurchase, OnlinePurchase, IMenuManager, MenuManagerAdmin, Utils
 */

public class Store implements IData{
    /**
     *
     */
    private ArrayList<Computer> computers;
    private ArrayList<Printer> printers;
    private PurchaseManager purchaseManagers;
    private main.utils.IMenuManager menuManager;
    private static Store store = null;

    /**
     *
     * @param purchaseManagers
     * @param menuManager
     */

    private Store(PurchaseManager purchaseManagers, IMenuManager menuManager) {
        this.computers = new ArrayList<>();
        this.printers = new ArrayList<>();
        this.purchaseManagers = purchaseManagers;
        this.menuManager = menuManager;
    }

    /**
     *
     * @param purchaseManagers
     * @param menuManager
     * @return
     */

    public static Store getInstance(PurchaseManager purchaseManagers, IMenuManager menuManager){
        store = new Store(purchaseManagers, menuManager);



        return store;
    }

    /**
     *
     * @throws Exception
     */


    public void createComputers() throws Exception {
        String name, description, manufacture;
        Scanner sel = new Scanner(System.in);
        System.out.print("Enter main.models.devices.Device Name:");
        name = sel.nextLine();
        System.out.print("Enter main.models.devices.Device Description:");
        description = sel.nextLine();
        System.out.print("Enter main.models.devices.Computer Manufacture: ");
        manufacture = sel.next();
        Computer aComputer = new Computer(name, description, manufacture);
        computers.add(aComputer);
    }

    /**
     *
     * @throws Exception
     */
    public void createPrinters() throws Exception {
        String name, description;
        int ppm;
        Scanner sel = new Scanner(System.in);
        System.out.print("Enter main.models.devices.Device Name:");
        name = sel.nextLine();
        System.out.print("Enter main.models.devices.Device Description:");
        description = sel.nextLine();
        System.out.print("Enter main.models.devices.Printer PPM: ");
        ppm = Integer.parseInt(sel.next());
        try {
            ppm = Integer.parseInt("5");
        } catch (NumberFormatException e) {
            System.out.println("There is a NumberFormatException!");
        }
        Printer aPrinter = new Printer(name, description, ppm);
        printers.add(aPrinter);

    }

    /**
     *
     * @throws Exception
     */

    public void createPurchase() throws Exception {
        String date, delAddress, storeLocation;
        int Cid, Did;
        int type;
        Scanner sel = new Scanner(System.in);
        System.out.print("Enter Customer Id:");
        Cid = Integer.parseInt(sel.nextLine());
        try {
            Cid = Integer.parseInt("12345");
        } catch (NumberFormatException e) {
            System.out.println("There is a NumberFormatException!");
        }
        System.out.print("Enter Device Id: ");
        Did = Integer.parseInt(sel.next());
        try {
            Did = Integer.parseInt("8754");
        } catch (NumberFormatException e) {
            System.out.println("There is a NumberFormatException!");
        }
        System.out.print("Enter Date: ");
        date = sel.next();
        System.out.print("Enter purchase type: ");
        type = Integer.parseInt((sel.next()));
        try {
            type = Integer.parseInt("0");
        } catch (NumberFormatException e) {
            System.out.println("There is a NumberFormatException!");
        }
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

    /**
     *
     */



    public void printComputers(){
        for (int i = 0; i < this.computers.size(); i++){
            System.out.println("main.models.devices.Computer (" + (i+1) + ") " + this.computers.get(i));

        }

    }

    /**
     *
     */
    public void printPrinters() {
        for (int i = 0; i < this.printers.size(); i++) {
            System.out.println("main.models.devices.Printer (" + (i + 1) + ") " + this.printers.get(i));

        }
    }

    /**
     *
     * @throws Exception
     */
    public void runBazar() throws Exception {
//        initStore();
//        createComputers();
//        createPrinters();
//        printComputers();
//        printPrinters();
        int selection;
        do {
            selection = menuManager.menuItem();
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


    /**
     *
     * @param id
     * @return
     */
    @Override
    // to check if the id given by the user matches one of the existing main.models.devices
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


