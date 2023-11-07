import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//this program will iterate through all elements in the array list using the iterator
public class Programme_5_Iterate {

    public static void main(String[] args) {
//create an arraylist and add elements
        List<String> planets = new ArrayList<>();
        planets.add("Jupiter"); // adding planet
        planets.add("Mars"); // adding planet
        planets.add("Earth"); // adding planet
        planets.add("Neptune"); // adding planet
        planets.add("Venus"); // adding planet

        //creating an iterator to iterate through the array list
        Iterator<String> iterator = planets.iterator();
        System.out.println("Iterating through the ArrayList using Iterator:  ");
        while (iterator.hasNext()){
            String planet = iterator.next();
            System.out.println(planet);
        }
    }
}
