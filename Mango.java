
import java.util.*;

public class Mango {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter total number of mangoes: ");
        int totalMangoes = sc.nextInt();

        System.out.println("enter total number of people: ");
        int totalPeople = sc.nextInt();

        if(totalPeople <= 0) { 
            System.out.println("enter number of people greater than 0");
        } else {
            int mangoesPerPerson = totalMangoes / totalPeople;
            int leftOverMangoes = totalMangoes % totalPeople;

            System.out.println("per person mangoes:" + mangoesPerPerson);
            System.out.println("left mangoes:" + leftOverMangoes);
           
        }
        sc.close();
    }
}

