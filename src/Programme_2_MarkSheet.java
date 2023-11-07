import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Programme_2_MarkSheet {
    //Scanner declaration for reading input from console
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Name: "); // user to enter name in the console using scanner
        String name = scan.next();
        System.out.println("Enter Student Roll Number: "); // user to enter roll number in the console using scanner
        int rollNo = scan.nextInt();
        System.out.println("Enter Maths Marks: "); // user to enter maths marks in the console using scanner
        int mathMarks = scan.nextInt();
        while (mathMarks < 0 || mathMarks >= 100) { // boundary created for marks input using while
            System.out.println("Invalid Input. Enter Marks between 0 to 100");
            mathMarks = scan.nextInt();
        }
        System.out.println("Enter Science Marks: "); // user to enter science marks in the console using scanner
        int sciMarks = scan.nextInt();
        while (sciMarks < 0 || sciMarks >= 100) { // boundary created for marks input using while
            System.out.println("Invalid Input. Enter Marks between 0 to 100");
            sciMarks = scan.nextInt();
        }
        System.out.println("Enter English Marks: "); // user to enter english in the console using scanner
        int engMarks = scan.nextInt();
        while (engMarks < 0 || engMarks >= 100) { // boundary created for marks input using while
            System.out.println("Invalid Input. Enter Marks between 0 to 100");
            engMarks = scan.nextInt();
        }
        //creating variables for total, percentage, grade and  result
        int total = sum(mathMarks, sciMarks, engMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathMarks, sciMarks, engMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNo, mathMarks, sciMarks, engMarks, total, percentage, result, grade);
        scan.close(); //closing the scanner
    }
        //calculating the sum
        public static int sum ( int a, int b, int c){
            return a + b + c;
        }
        //calculating the results on subject marks using if else
        //creating method calculateResult to return "pass" or "fail"
        public static String calculateResult ( int mathMarks, int sciMarks, int engMarks ){
            if (mathMarks < 35 || sciMarks < 35 || engMarks < 35) {
                return "Fail";
            } else {
                return "Pass";
            }
        }
//calculating the grade on percentage and result
        public static String calculateGrade ( int percentage, String result){
            String grade = null;
            if (result.equalsIgnoreCase("Pass")) ;
            {
                if (percentage >= 80) {
                    grade = "A+";
                } else if (percentage >= 60) {
                    grade = "A";
                } else if (percentage >= 50) {
                    grade = "B";
                } else if (percentage >= 35) {
                    grade = "C";
                } else {
                    grade = " - ";
                }
                return grade;
            }
        }
        public static void printTheMarkSheet(String name,int rollNum, int mathMarks, int scienceMarks,
        int englishMarks, double total, double percentage, String result, String grade){

        System.out.println("-------------------------------------");
        System.out.println("|                                   |");
        System.out.println("|             MARK SHEET            |");
        System.out.println("|___________________________________|");
        System.out.println("|  NAME: " + name + "                    |");
        System.out.println("|  Roll No: " + rollNum + "                      |");
        System.out.println("|__________________________________ |");
        System.out.println("|  Subjects:Marks                   |");
        System.out.println("|___________________________________|");
        System.out.println("|  Maths:" + mathMarks + "                         |");
        System.out.println("|  Science:" + scienceMarks + "                       |");
        System.out.println("|  English:" + englishMarks + "                       |");
        System.out.println("|___________________________________|");
        System.out.println("|  Total:" + total + "                      |");
        System.out.println("|___________________________________|");
        System.out.println("|  Percentage:" + percentage + "                  |");
        System.out.println("|  Result:" + result + "                      |");
        System.out.println("|  Grade:" + grade + "                         |");
        System.out.println("-------------------------------------");
    }
}