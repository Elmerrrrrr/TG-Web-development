import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {



    public static void main(String[] args) {

       while (true) {

//           String length;
           String weight;
           double bmi = 0;


           Scanner scanner = new Scanner(System.in);

           System.out.print("\nLengte in m: ");
           double length = scanner.nextDouble();
//           double len = Double.parseDouble(length);
           System.out.print("Gewicht in kg: ");
           weight = scanner.next();
           double wei = Double.parseDouble(weight);

//           System.out.println(length + " " + weight);
           bmi = (len/(wei*wei));
           System.out.println(bmi);
           double result = bmi*100.0/100.0;
           System.out.println("\nBMI is: " + result);

       }

    }


}
