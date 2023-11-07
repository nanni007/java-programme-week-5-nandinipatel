import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMap {
//This program will print the people called with the age using hashMap
public static void main(String[] args) {
    //creating hashMap both String keys and Integer values

    Map<String, Integer> employeeName = new HashMap<>();

    //adding employee names to the HashMap
    employeeName.put("Rachel", 297); // Adding employee name and id
    employeeName.put("Chandler", 286);  // Adding employee name and id
    employeeName.put("Jennifer", 275);  // Adding employee name and id
    employeeName.put("Harvey", 313);  // Adding employee name and id
    employeeName.put("Mike", 206);  // Adding employee name and id

    //using for each loop to iterate through the values in the map
    System.out.println("Employee ID:");
    for (Integer ID : employeeName.values()){
        System.out.println(ID);
    }
}


}
