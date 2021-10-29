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

public class DogGenetics {
    
    public static void main(String[] args){
        
        String[] dog = new String[1]; //use string array instead of string object to avoid compiler error of uninitialized string
        int percent = 100;
        Random rng = new Random();
        String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What is your dog's name?");
        
        boolean isValid = false; // used to end dowhile loop once condition is met

        do {

            String input = myScanner.nextLine();

            if(input == null || input.isEmpty()) { // used to ensure user provides input
                System.out.println("You did not enter anything! Please enter your dog's name:");
            } else {
                dog[0] = input;
                isValid = true;
            }
            

        } while(!isValid);
        
        System.out.println("Well then, I have this highly reliable report on " + dog[0] +"'s prestigious background right here.");
        System.out.println();
        
        System.out.println(dog[0]+ " is: ");
        System.out.println();
        
        for(int i = 0; i<breeds.length; i++){ 
            if(i == breeds.length-1){ // on last iteration, display remaining percentage
                System.out.println(percent+"% "+breeds[i]);
            } else { // on each iteration, generate random percentage and display
                int random = rng.nextInt(percent)+1;
                percent -= random; // subtract percentage from total (initially 100) to be used as range for next iteration
                System.out.println(random+"% "+breeds[i]); 
            }
        }
        
        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");
    }
    
}
