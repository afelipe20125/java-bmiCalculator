/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.calculator;

/**
 *
 * @author mlarrubia
 */
// Import Scanner Object
import java.util.Scanner;

public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Scanner object
        Scanner in = new Scanner(System.in);
        // Prompt for weight
        System.out.println("what is yor weight");
        int weight = in.nextInt();
        // Prompt for height
        System.out.println("what is your height");
        int height = in.nextInt();
        // invoke the calculateBMI method
        double myBmi = calculateBmi(weight, height);

    }

    // calculateBMI method definition
    public static double calculateBmi(int weight, int height) {

        return (weight / height);
    }
}
