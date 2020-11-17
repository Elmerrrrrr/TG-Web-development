import java.util.Scanner;

public class SpaceBoxing {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nPlease enter your current earth weight: ");
            double inputWeight = scanner.nextDouble();



            if (inputWeight > 0) {

                System.out.println("\nI have information for the following planets: ");
                System.out.println("1. Venus   2. Mars    3. Jupiter");
                System.out.println("4. Saturn  5. Uranus  6. Neptune");

                System.out.print("\nWhich planet are you visiting? ");
                byte planetChoice = scanner.nextByte();

                double answer = 0;

                switch (planetChoice) {

                    case 1:
                        answer = inputWeight * 0.78;
                        break;
                    case 2:
                        answer = inputWeight * 0.39;
                        break;
                    case 3:
                        answer = inputWeight * 2.65;
                        break;
                    case 4:
                        answer = inputWeight * 1.17;
                        break;
                    case 5:
                        answer = inputWeight * 1.05;
                        break;
                    case 6:
                        answer = inputWeight * 1.23;
                        break;
                    default:
                        System.out.println("\nThat's not a correct choice!");
                }

                System.out.println("Your weight would be " + (Math.round(answer*100.00)/100.00) + " kilos on that planet.\n\n");
            }


        }
    }
}
