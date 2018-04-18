import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;
        Scanner in=new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.println("Type a number:");

        guess = in.nextInt();
        int difference= number-guess;

        System.out.println("Your guess is: "+guess);
        System.out.println("The number I was thinking of is: "+number);
        System.out.println("You were off by: "+difference);

    }

}
