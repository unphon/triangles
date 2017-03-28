package com.unphon.triangles;

import com.unphon.triangles.io.InputReader;
import com.unphon.triangles.io.MessageHelper;
import com.unphon.triangles.model.Triangle;

public class Runner {

    public static void main(String[] args) {

        MessageHelper.welcome();
        boolean doMore = true;

        while(doMore) {

            double length1 = InputReader.getInput("First");
            double length2 = InputReader.getInput("Second");
            double length3 = InputReader.getInput("Third");

            if(InputReader.isValid(length1, length2, length3)) {
                Triangle triangle = new Triangle(length1, length2, length3);
                System.out.println("Congratulations... your triangle is " + triangle.getType());
            } else {
                System.out.println("Sorry, invalid input.");
            }

            doMore = InputReader.isContinue();
            MessageHelper.getLine();
        }

        MessageHelper.farewell();

    }

}
