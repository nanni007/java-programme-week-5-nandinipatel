
import java.util.ArrayList;
import java.util.List;
/* this program will output added colours in the list
 */
public class Programme_4_ArrayList {
    public static void main(String[] args) { //main method
        //create a new arraylist to store colours
        List<String> colours = new ArrayList<>(); // using list and Array list to add colours
        //adding some colours to the ArrayList
        colours.add("Pink"); //adding pink
        colours.add("Magenta"); //adding magenta
        colours.add("Cyan"); //adding Cyan
        colours.add("Red"); //adding red
        colours.add("Blue"); //adding blue
        colours.add("Green"); //adding green

        //print the collection using for loop statement
        System.out.println("Colours in the ArrayList: ");
        for (String colour : colours) {   // for each statement to print colours
            System.out.println(colour);
        }
    }
}
