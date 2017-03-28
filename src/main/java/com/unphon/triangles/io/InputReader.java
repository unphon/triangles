package com.unphon.triangles.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {

    public static double getInput(String label) {
        System.out.print(label + " Length : ");
        Scanner sc = new Scanner(System.in);

        try {
            return sc.nextDouble();
        } catch (InputMismatchException exception) {
            return -1;
        }

    }

    public static boolean isContinue() {
        System.out.println("Do you want to continue? [Type y or Y to continue]... ");

        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferRead.readLine();

            if(inputString.equalsIgnoreCase("Y")) {
                return true;
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    public static boolean isValid(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0;
    }
}