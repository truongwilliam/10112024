package assignments7;
import java.util.ArrayList;
import java.util.Collections;

public class SapXepArrayList {
   public static void main(String[] args) {
       
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);
        
        Collections.sort(numbers);      
        System.out.println("Danh sach sau khi sap xep: " + numbers);
    } 
}
