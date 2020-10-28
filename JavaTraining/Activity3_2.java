
import java.util.HashSet;

public class Activity3_2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
       
        hs.add("T");
        hs.add("R");
        hs.add("I");
        hs.add("S");
        hs.add("H");
        hs.add("A");               
        System.out.println("Original HashSet: " + hs);   
        System.out.println("Size of HashSet: " + hs.size());       
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        
        if(hs.remove("H")) {
        	System.out.println("H removed from the Set");
        } else {
        	System.out.println("H is not present in the Set");
        }      
        System.out.println("Checking if T is present: " + hs.contains("T"));       
        System.out.println("Updated HashSet: " + hs);
    }
}
