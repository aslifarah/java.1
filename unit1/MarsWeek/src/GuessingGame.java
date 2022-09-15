import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame(){
    //Create a new Scanner variable named input
        Scanner input = new Scanner(System.in);

        //boolean object called correctGuess
        boolean correctGuess = false;

        //Create 2 int variables. guess and increment
        int guess = 0;
        int increment = 0;

        //Print "Hello user. What is your name?"
        System.out.println("Hello user, What is your name?");

        //String variable named name equal to input.nextLine()
        String name = input.nextLine();

        //Print "Welcome name I'm thinking of a number between 1 and 100."
        System.out.println("Welcome " + name + " I'm thinking of a number between 1 and 100.");

        //Create a new random object by calling the Random constructor
        Random rand = new Random();

        //int named number equal to rand.nextInt(100) and rand.nextInt(100) chooses the next number
        int number = rand.nextInt(100);

        //Print "Try to guess my number."
        System.out.println("Try to guess my number.");


        //while correctGuess is false
        while (correctGuess == false)
        {
            //increment
            increment++;

            //try catch statement that catches Exception e
            try
            {
                //Set guess equal to input.nextInt()
                guess = input.nextInt();
            }
            catch (Exception e)
            {
                //String called badInput and set it to input.next()
                String badInput = input.next();

                //Print "That's not an integer, try again"
                System.out.println("That's not an integer, try again");

                continue;
            }

            //check if the guess is greater than 100 or less than 1
            if (guess > 100 || guess < 1)
            {
                //Print "Your guess is out of range. Please try again."
                System.out.println("Your guess is out of range. Please try again.");
            }

            //check if the guess is greater than the number
            else if (guess > number)
            {
                //Print "Your guess is too high. Please try again."
                System.out.println("Your guess is too high. Please try again.");
            }

            //check if the guess is less than the number
            else if (guess < number)
            {
                //Print "Your guess is too low. Please try again."
                System.out.println("Your guess is too low. Please try again.");
            }

            //check if the guess is equal to number
            else if (guess == number)
            {
                //Print "Well done, name! You found my number in increment tries!"
                System.out.println("Well done, " + name + "! You found my number in " + increment + " tries!");

                correctGuess = true;
            }
        }

    }

}



