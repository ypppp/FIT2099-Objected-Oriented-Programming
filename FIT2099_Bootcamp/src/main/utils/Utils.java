package main.utils;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yee Perng Yew
 * @version 1
 * @see Scanner, Random
 */
public class Utils {
    /**
     *
     * @param low
     * @param high
     * @return
     */
    public static int nextID(int low, int high) {
        Random r = new Random();
        return (r.nextInt(high - low) + low);
    }

    /**
     *
     * @param inp
     * @param low
     * @param high
     * @return
     */

    public static boolean verifyString(String inp, int low, int high){
        return(inp != null && inp.length() >= low && inp.length() <= high);
    }

    /**
     *
     * @param inp
     * @param low
     * @param high
     * @return
     */
    public static boolean verifyInt(Integer inp, int low, int high){
        return(inp != null && inp >= low && inp <= high);
    }
}
