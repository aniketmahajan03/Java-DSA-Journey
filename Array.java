
import java.util.*;
public class Array {

    public static void main(String args[]) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Nashik");
        cities.add("Kopargaon");
        cities.add("Pune");

        if(cities.contains("Nashik")) {
            System.out.println("Nashik is in the List");
        } else {
            System.out.println("Nashik is not int the list");
        }
    }
}