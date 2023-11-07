import java.util.ArrayList;
import java.util.List;

public class Programme_6_Retrieve {
    //this program will retrieve an specific index from elements in the array list
    public static void main(String[] args) {
//creating an ArrayList with some elements (stationery)
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Pencil"); //Adding the element
        arrayList.add("Eraser"); //Adding the element
        arrayList.add("Ruler"); //Adding the element
        arrayList.add("Sharpener"); //Adding the element
        arrayList.add("Stapler"); //Adding the element
        arrayList.add("Note Book"); //Adding the element

        //using a specific index from which i want to retrieve an element
        int indexToRetrieve = 3; // this can be changed to the index you wish to appear

//Checking if the index is valid and available using if else statement
        if (indexToRetrieve >= 0 && indexToRetrieve < arrayList.size()) {
            String element = arrayList.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + element);
        } else {
            System.out.println("Invalid Index. Select index within the ArrayList size.");
        }
    }
}
