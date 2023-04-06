package main.utils;

import java.util.Scanner;
/**
 * @author Yee Perng Yew
 * @version 1
 * @see Scanner
 */
public class MenuManagerAdmin implements IMenuManager {


    private static MenuManagerAdmin menuManagerAdmin = null; // a variable to set it null for the factory method

    /**
     *
     */
    private MenuManagerAdmin(){

    }

    /**
     *
     * @return
     */
    public static MenuManagerAdmin getInstance(){
        menuManagerAdmin = new MenuManagerAdmin();

        return menuManagerAdmin;
    }

    /**
     *
     * @return
     */
    public int menuItem() {
        Scanner sel = new Scanner(System.in);

        System.out.println("1) New Computer");
        System.out.println("2) New Printer");
        System.out.println("3) New Purchase");
        System.out.println("4) List Computers");
        System.out.println("5) List Printers");
        System.out.println("6) List Purchases");
        System.out.println("7) Exit");
        System.out.print("Select one:");
        int choice = Integer.parseInt(sel.nextLine());
        System.out.println("Your choice:" + choice);
        return choice;
    }

}
