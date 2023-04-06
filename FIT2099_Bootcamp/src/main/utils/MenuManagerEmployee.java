package main.utils;

import java.util.Scanner;

/**
 * @author Yee Perng Yew
 * @version 1
 * @see Scanner
 */

public class MenuManagerEmployee {


    public static MenuManagerEmployee menuManagerEmployee = null; // a variable to set it null for the factory method

    /**
     *
     */
    private MenuManagerEmployee(){

    }

    /**
     *
     * @return
     */
    public static MenuManagerEmployee getInstance(){
        menuManagerEmployee = new MenuManagerEmployee();

        return menuManagerEmployee;
    }
        public int menuItem() {
            Scanner sel = new Scanner(System.in);

            System.out.println("1) New Computer");
            System.out.println("2) New Printer");
            System.out.println("3) New Purchase");
            System.out.println("4) Exit");
            System.out.print("Select one:");
            int choice = Integer.parseInt(sel.nextLine());
            System.out.println("Your choice:" + choice);
            return choice;
        }

}

