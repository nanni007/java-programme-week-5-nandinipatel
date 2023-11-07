import java.util.ArrayList;
//This program will compare two array list and print which of the two is not equal
public class Programme_11_CompareTwoArrayList {
    public static void main(String[] args) {

        //declaring and initializing the first ArrayList (c1)
        ArrayList<String> c1=new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        //declaring and initializing the second ArrayList (c2)
        ArrayList<String> c2 =new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //function to compare the two ArrayLists
        boolean isEqual = c1.equals(c2);

        //printing the results using if else statement

        if(isEqual){
            System.out.println("c1 and c2 are Equal.");
        }else{
            System.out.println("c1 and c2 are not equal.");
        }
    }
}
