import java.util.Scanner;

public class GuessHiLo {


    public static void main(String[] args) {


        byte counter = 0;
        int guessedNumber = 0;
        int randomNumber = (int) Math.round(Math.random() * 100);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n     Secret number: " + randomNumber + "\n \n");

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it in 5 times.");
        for (counter = 0; counter < 5; counter++) {

            try {
                System.out.print("> ");
                guessedNumber = scanner.nextInt();

                if (guessedNumber < 0) {
                    System.out.println("\nWhat a waste! No negative numbers. This costs you as turn!");
                } else if (randomNumber == guessedNumber) {
                    System.out.println("\nYou guessed it!  What are the odds?!?");
                    break;
                } else if (guessedNumber < randomNumber && counter == 4) {
                    System.out.println("\nSorry no more turns! You were too low. I was thinking of " + randomNumber);
                    break;
                } else if (guessedNumber > randomNumber && counter == 4) {
                    System.out.println("\nSorry no more turns! You were too high. I was thinking of " + randomNumber + "\n\n");
                    break;
                } else if (guessedNumber < randomNumber) {
                    System.out.println("Higher!");
                } else if (guessedNumber > randomNumber) {
                    System.out.println("Lower!");
                }
            } catch (Exception e) {
                System.out.println("Error, crash :( No Letters");
                break;
            }


        }

    }
}