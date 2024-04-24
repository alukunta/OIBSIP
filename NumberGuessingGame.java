package Rc.Tech.Solutions;

import java.util.*;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        int maxAttempts = 10;
        
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Guess the number between " + minRange + " and " + maxRange + ".");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == targetNumber) {
                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }
        
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
        }
        
        scanner.close();
    }
}