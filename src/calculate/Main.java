package calculate;
/**Program to input first number
 * input second number
 * choose operation symbol
 * program calculates operation using do while loop and switch statement when operation is changed
 */

import java.util.Scanner;
//In this program, the Calculator class is the Parent class and Main class is the child class

public class Main extends Calculator {
    public static void main(String[] args) {
        //creating object
        Calculator obj = new Calculator();
        Scanner scan = new Scanner(System.in);  //Scanner to call from input from console
        char continueCalculation;
        do {  //using do while so that program can continue to loop
            System.out.println("Enter First Number"); //calling first number
            int num1 = scan.nextInt(); //using int to assign first number
            System.out.println("Enter Second Number");  //calling second number
            int num2 = scan.nextInt(); //using int to assign second number
            System.out.println("Enter one Symbol"); // calling symbol to input
            char symbol; //using char to identify the symbol input by the user
            symbol = scan.next().charAt(0);
            obj.calculateResult(num1, num2, symbol);
            System.out.println("Would you like to do more calculations? Enter 'Y' or 'N' ");
            continueCalculation = scan.next().charAt(0);
        } while (continueCalculation == 'Y' || continueCalculation == 'y'); // while loop allows user to input both lowercase and uppercase of letter input
        System.out.println("Calculation Complete.");
        scan.close(); // closing scanner
    }
}
