import java.util.ArrayList;
import java.util.List;

public class Programme_7_ArrayListEmpty {
    // this Program will check if the array list is empty or not
    public static void main(String[] args) {
        //Creating an ArrayList
        List<String> arrayList = new ArrayList<>();

        //Function to check if ArrayList is Empty using If else statement
        if(arrayList.isEmpty()){
            System.out.println("The ArrayList is Empty.");
        }else{
            System.out.println("The ArrayList is not Empty.");
        }
        //Adding elements to the ArrayList
//        arrayList.add("Ludo");
//        arrayList.add("Chess");
//        arrayList.add("Monopoly");
//        arrayList.add("Sequence");
//        arrayList.add("Mancala");

/** if the above is elements are uncommented then the results produced
 * will have no elements in the first sout (hence empty)
 * and elements are present in the second(hence not empty)
 */

        //checking the ArrayList again if it is empty
        if(arrayList.isEmpty()){
            System.out.println("The ArrayList is Empty.");
        }else{
            System.out.println("The ArrayList is not Empty.");
        }
    }
}
