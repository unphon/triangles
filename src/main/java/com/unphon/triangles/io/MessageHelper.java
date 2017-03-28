package com.unphon.triangles.io;

public class MessageHelper {

    public static void welcome() {
        getLine();
        System.out.println("This program classifies triangle based on sides. Please enter the length of their sides.");
        getLine();
    }

    public static void getLine() {
        System.out.println("****************************************************************************************");
    }

    public static void farewell() {
        System.out.println("Hope you have fun. Bye!");
        getLine();
    }


}