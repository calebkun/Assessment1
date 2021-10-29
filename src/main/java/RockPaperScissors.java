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

public class RockPaperScissors {
    
    public static void main(String[] args){
        
        boolean isPlaying = false; // used to end dowhile loop once condition is met
        
        do{ // entire program wrapped in dowhile loop to enable replay
            
            // declare necessary variables
            int rounds = 0;
            int uWin = 0;
            int tie = 0;
            int cWin = 0;

            // greet user
            System.out.println("`~`~O[]X~`~` Welcome to Rock, Paper, Scissors! `~`~O[]X~`~`");
            System.out.println();

            /* Prompt user to input number of rounds 1-10
            do while loop will collect input until the user has provided input of the
            appropriate format
            */

            boolean isInt = false;
            Scanner myScanner = new Scanner(System.in);

            System.out.println("How many rounds will you like to play? Please input a whole number between 1 and 10:");

            do {

                try{ //try catch block to ensure input is of correct format

                    String input = myScanner.nextLine();
                    rounds = Integer.parseInt(input);

                    if (rounds >= 1 && rounds <= 10){ //ensure number is within proper range
                        isInt = true;
                        System.out.println();
                    } else {
                        System.out.println("Number was out of range. Please input a whole number between 1 and 10:");
                    }

                } catch (NumberFormatException e){ // print usage message and prompt user for correct input
                    System.out.println("Input was not a whole number. Usage:  5");
                    System.out.println("Please input a whole number between 1 and 10:");
                }

            } while (!isInt);

            System.out.println();


            // Perform rounds number of rounds
            for (int i = 0; i < rounds; i++){
                boolean isValid = false;

                int hand = 0;
                System.out.println("`~`~O[]X~`~` Round: " + (i+1) + " `~`~O[]X~`~`");
                System.out.println();
                System.out.println("Which hand will you throw?");

                do {

                    System.out.println("Please input 1 for rock, 2 for paper, or 3 for scissors:");
                    System.out.println();
                    try {

                        String input = myScanner.nextLine();
                        hand = Integer.parseInt(input);

                        if (hand == 1){ //alternative: switch statement
                            System.out.println("You threw rock!");
                            isValid = true;
                        } else if (hand == 2){
                            System.out.println("You threw paper!");
                            isValid = true;
                        } else if (hand == 3){
                            System.out.println("You threw scissors!");
                            isValid = true;
                        }else {
                            System.out.println("Number was out of range.");
                            System.out.println();
                        }
                    } catch (NumberFormatException e){
                        System.out.println("Input was not of correct format. Usage: [int]");
                        System.out.println("Where int is a whole number [1,3].");
                        System.out.println();
                    }

                    } while (!isValid);

                    // Computer throws
                    Random rng = new Random();

                    int comp = rng.nextInt(3)+1;

                    // Determine results
                    if (comp == 1){
                        System.out.println("Computer threw rock!");
                        System.out.println();
                        if(hand == 2){
                            System.out.println("You won this round!");
                            uWin++;
                        } else if (hand == 3){
                            System.out.println("Computer won this round!");
                            cWin++;
                        } else {
                            System.out.println("There was a tie!");
                            tie++;
                            }
                    } else if (comp == 2){
                        System.out.println("Computer threw paper!");
                        System.out.println();
                        if(hand == 3){
                            System.out.println("You won this round!");
                            uWin++;
                        } else if (hand == 1){
                            System.out.println("Computer won this round!");
                            cWin++;
                        } else {
                            System.out.println("There was a tie!");
                            tie++;
                            }
                    } else if (comp == 3){
                        System.out.println("Computer threw scissors!");
                        System.out.println();
                        if(hand == 1){
                            System.out.println("You won this round!");
                            uWin++;
                        } else if (hand == 2){
                            System.out.println("Computer won this round!");
                            cWin++;
                        } else {
                            System.out.println("There was a tie!");
                            tie++;
                            }
                }
                System.out.println();

                if ((i+1) < rounds){
                    System.out.println("Round " + (i+1) + " is over. Prepare for the next round!");
                    System.out.println();
                }
            }

            // prompt user of end of game and display results
            System.out.println("The game is over. Hope you had fun!");
            System.out.println();
            System.out.println("Results:");
            System.out.println("User wins: " +uWin);
            System.out.println("Computer wins: " +cWin);
            System.out.println("Ties: " +tie);
            
            if(uWin > cWin){
                System.out.println("Overall winner: You!");
            } else if (uWin < cWin){
                System.out.println("Overall winner: Computer!");
            } else {
                System.out.println("Overall winner: tie!");
            }
            
            System.out.println();

            // ask the user if they want to play again
            boolean isValid = false;

            System.out.println("Would you like to play again? For yes, please enter 1, and for no, please enter 2.");
            do{
                try{
                    String input = myScanner.nextLine();
                     int play = Integer.parseInt(input);
                     
                     if(play == 1){
                         isValid = true;
                     } else if (play == 2){
                        System.out.println("That's ok! Thanks for playing!");
                        isPlaying = true;
                        isValid = true;
                     } else {
                        System.out.println("Number was out of range.");
                     }
                    
                } catch (NumberFormatException e){
                    System.out.println("Input was not of correct format. Usage: [int]");
                    System.out.println("Where int is a whole number [1,2].");
                    System.out.println();
                }
                
            } while(!isValid);
        
        } while (!isPlaying);
    }
}
