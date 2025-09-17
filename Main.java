/*
 * Created by: Julianne Leblanc-Peltier
 * Created on: September 17, 2025
 * This program is a questionaire to determine what kind of programming language the user is
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // create objects
        Scanner userNameInput = new Scanner(System.in);
        System.out.println("Enter username");


        // get userName
        String userName = userNameInput.nextLine();


        Main questionaire = new Main(); // Create a questionaire object

        questionaire.questions(); // Call the questions() method

        myCar.speed(200);          // Call the speed() method


        // prints the user's name
        Scanner.out.println(userName);
        // closes the userName
        userNameInput.close();
    }

    public void questions() {
        Scanner myObj = new Scanner(System.in);

        final String question[] = {
            "1) Do you like typing?", 
            "2) Do you have a lot of experience with coding?", 
            "3) Do you enjoy simplicity?", 
            "4) DO you plan on going into a programming field?", 
            "5) Do you like classes?", 
            "6) What's your favourite field of programming?", 
            "7) How old are you?", 
            "8) How hygenic are you?", 
            "9) How social are you?", 
            "10) What food would you eat at a restaurant?"
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

        for (int counter = 0; counter <= 9; counter++){
            System.out.println(question[counter]);
            System.out.println(choices[counter]);
            
            
        }
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        // add constants banners
        // get userName
        // if questionaire complete, then state what prog. lang. the user is

        System.out.println("Max speed is: " + maxSpeed);
    }
}
