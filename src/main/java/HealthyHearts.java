/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author calebdiaz
 */

import java.util.*;

public class HealthyHearts {
    
    public static void main (String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        int max = 220;
        int range1 = 0;
        int range2 = 0;
        int age = 0;
        
        boolean isValid = false; // used to end dowhile loop once condition is met
        
        System.out.println("What is your age?");
        
        do {
            try{
                System.out.println("Please enter a whole number:");
                String input = myScanner.nextLine();
                age = Integer.parseInt(input);
                if (age >= 0 && age <= 220){
                        isValid = true;
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("Number was out of range.");
                        System.out.println();
                    }
            } catch (NumberFormatException e){  // display usage message when incorrect input is provided
                System.out.println();
                System.out.println("Input was not of the correct format.");
                System.out.println("Usage: [int]");
                System.out.println("Where int is whole number [0,220].");
                System.out.println();
            }
        } while(!isValid);
        
        // calculate stats
        max -= age;
        range1 = (int)(max*0.85);
        range2 = (int)(max*0.5);
        
        System.out.println("Your maximum heart rate should be "+max+ " beats per minute");
        System.out.println("Your target HR Zone is "+range2+" - "+range1+" beats per minute");
    }
    
}
