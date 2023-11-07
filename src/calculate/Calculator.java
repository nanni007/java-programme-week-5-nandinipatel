package calculate;
//This class is the parent class and has all the methods for using the operations
public class Calculator {
    public void addition(int a, int b) { //instance method for addition
        int result = a + b;
        System.out.println("Addition of " + a + " and " + b + " is " + result);
    }

    public void subtraction(int a, int b) { //instance method for subtraction
        int result = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is " + result);
    }

    public void division(int a, int b) {  //instance method for division
        if (b != 0) {
            int result = a / b;
            System.out.println("Division of " + a + " and " + b + " is " + result);
        } else
            System.out.println("Zero is not divisible");
    } //division method has if else statement so that it can identify the number zero and print indivisible message when zero is entered by user

    public void multiplication(int a, int b) {  //instance method for multiplication
        int result = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is " + result);
    }

    public void calculateResult(int a, int b, char symbol) { // instance method to allow calculation between operations
        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
            default:
                System.out.println("Invalid Input, Enter one symbol +, -, *, /"); // Invalid message when other symbol is input by user
                break;
        }
    }
}

