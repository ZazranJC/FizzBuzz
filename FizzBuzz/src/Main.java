// Creating Simple Game Called FizzBuzz:

//We require user inputs, therefore we need to import the following

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //To take in user input
        System.out.print("Please type in any number: ");
        int number = scanner.nextInt();

        //Now to use comparitive operators:
        if ((number % 5 == 0) && (number % 3 != 0)) {
            System.out.println("Fizz");
        } else if ((number % 5 != 0) && (number % 3 == 0)) {
            System.out.println("Buzz");
        } else if ((number % 5 == 0) && (number % 3 == 0)) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println(number);
        }

    }
}
