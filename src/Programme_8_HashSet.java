import java.util.HashSet;
import java.util.Set;
//this program uses hashSet method to store Integers within a range
public class Programme_8_HashSet {
    public static void main(String[] args) {
        //creating hashset to store Integer objects
        Set<Integer>numberSet = new HashSet<>();
        //store the numbers 10, 20, 30, 40 and 50
        numberSet.add(10); //adding numbers
        numberSet.add(20); //adding numbers
        numberSet.add(30); //adding numbers
        numberSet.add(40); //adding numbers
        numberSet.add(50); //adding numbers

        //Check which numbers are between 1 and 50
        System.out.println("Numbers between 1 and 50 in the set are: ");
        //function to allow numbers between 1 to 50
        for (int i = 1; i<=50; i++){
            if(numberSet.contains(i)){
                System.out.println(i);
            }
        }
    }
}
