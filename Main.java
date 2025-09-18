/*
 * Created by: Julianne Leblanc-Peltier
 * Created on: September 17, 2025
 * This program is a questionaire to determine what kind of programming language the user is
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // score choice variables
        int choiceJava = 0;
        int choiceCpp = 0;
        int choicePython = 0;
        int choiceScratch = 0;

        // create objects
        Scanner userNameInput = new Scanner(System.in);
        Scanner choiceInput = new Scanner(System.in);

        // gets userName
        System.out.println("Enter username: ");
        String userName = userNameInput.nextLine();
        userName = userName.trim();


        // prints all questions and choices, gets userChoice input
        for (int counter = 0; counter <= 9; counter++){
            Main questionaire = new Main();
            questionaire.questions(counter);

            System.out.println("\nEnter: ");
            String userChoice = choiceInput.nextLine();     
            userChoice = userChoice.trim();

            // adds a counter to whichever choice is selected per question
            switch(userChoice.toUpperCase()){
                case "A":
                    choiceJava++;
                    break;
                case "B":
                    choiceCpp++;
                    break;
                case "C":
                    choicePython++;
                    break;
                case "D":
                    choiceScratch++;
                    break;
                default:
                    System.out.println("Error! Please enter valid response!");
                    counter--;
                    break;
            }
        }

        int[] determineChoice = {choiceJava, choiceCpp, choicePython, choiceScratch};
        String[] userLanguage = {"Java", "C++", "Python", "Scratch"};

        int highestScore = determineChoice[0];
        for (int i = 1; i < determineChoice.length; i++) {
            if (determineChoice[i] > highestScore) {
                highestScore = determineChoice[i];
            }
        }

        StringBuilder finalUserLanguages = new StringBuilder();
        int tiedCount = 0;

        for (int i = 0; i < determineChoice.length; i++) {
            if (determineChoice[i] == highestScore) {
                if (tiedCount > 0) {
                    finalUserLanguages.append(", ");
                }
                finalUserLanguages.append(userLanguage[i]);
                tiedCount++;
            }
        }

        if (tiedCount == 1) {
            System.out.println(userName + ", You are " + finalUserLanguages + ".");
        } else {
            System.out.println("There is a tie! " + userName + ", You are: " + finalUserLanguages + ".");
        }

        // closes all input Scanner objects
        userNameInput.close();
        choiceInput.close();
    }

    public void questions(int counter) {

        final String question[] = {
            "\n1) Do you like typing?\n", 
            "\n2) Do you have a lot of experience with coding?\n", 
            "\n3) Do you enjoy simplicity?\n", 
            "\n4) Do you plan on going into a programming field?\n", 
            "\n5) Do you like classes?\n", 
            "\n6) What's your favourite field of programming?\n", 
            "\n7) How old are you?\n", 
            "\n8) How hygenic are you?\n", 
            "\n9) How social are you?\n", 
            "\n10) What food would you eat at a restaurant?\n"
        };

        final String choices[] = {
            """
                A) I've tested my typing speed before (it's fast)
                B) I like typing, but I won't tell anyone
                C) I'm competitive, but I'm not very good
                D) No, the mouse button was made for me
            """, 
            """
                A) I was born making classes
                B) With age comes experience
                C) I made a calculator once
                D) I can do the minecraft cheat codes
            """, 
            """
                A) Simplicity is laziness
                B) Back in my day we didn't have simplicity
                C) Work smarter, not harder
                D) I like it as easy as can be
            """, 
            """
                A) I am the programming field
                B) Yeah, I have a Windows 7
                C) Yeah, I'm just getting into the field
                D) What's programming?
            """, 
            """
                A) Whatever C++ said
                B) I AM classes
                C) Nah, we don't do that here
                D) My favourite class is art
            """, 
            """
                A) I love making andriod apps
                B) I love game development
                C) I love web development and data analysis
                D) The soccer field :D
            """, 
            """
                A) I'm in my prime
                B) I see the light
                C) I'm young with a dream
                D) I'm not supposed to tell my age to strangers
            """, 
            """
                A) I have a 20 step skincare routine
                B) I use an 8 in 1, it gets the job done
                C) I have a loofa
                D) I take bubble baths
            """, 
            """
                A) I talk business
                B) I love politics
                C) Everyone wants to know what I'm up to
                D) I'm kinda clueless, but I like to join in on the fun
            """, 
            """
                A) Wagyu
                B) Green bean casserole
                C) Penne pasta
                D) Chicken fingers
            """
        };

        System.out.println(question[counter]);
        System.out.println(choices[counter]);
    }
}
