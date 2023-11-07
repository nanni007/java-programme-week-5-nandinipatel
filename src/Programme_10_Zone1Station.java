import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programme_10_Zone1Station {
    // this program will use Hashmap to display the lines that pass through stations heading to Zone 1 using the london Underground lines
    public static void main(String[] args) {
        //creating a Hashmap to map stations to the lines they are on
        Map<String, String> stationToLine = new HashMap<>();

        //Load the HashMap with Zone 1 stations and their lines
        stationToLine.put("King's Cross St Pancras", "Circle Hammersmith & City, Metropolitan, Northern, Piccadilly, Victoria");
        stationToLine.put("Waterloo", " Bakerloo, Jubilee, Waterloo & City");
        stationToLine.put("Oxford Circus", "Bakerloo, Central");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the station you want to reach: ");
        String destinationStation = scan.nextLine();
        //close scanner

        //  public static void findTubeLines(HashMap<String,String>()){
        for (Map.Entry<String, String> map : stationToLine.entrySet())
            if (map.getKey().equalsIgnoreCase(destinationStation)) {

                System.out.println("The tubes running at " + map);
            }
        scan.close();
    }
}

