import java.util.Scanner;

public class FizzBuzz {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){

        System.out.print("Enter your number: ");
        int input = scanner.nextInt();


       if (input %3 == 0 && !(input %15 == 0)){
           System.out.println("Fizz!");
        }
       else if(input %5 == 0 && !(input %15 == 0)){
           System.out.println("Buzz!");
       }
       else if(input %15 == 0){
           System.out.println("Fizz Buzz!");
       }
       else System.out.println(input);
        }
    }
}
