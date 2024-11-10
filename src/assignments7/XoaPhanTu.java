package assignments7;
import java.util.ArrayList;

public class XoaPhanTu {
     public static void main(String[] args) {      
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        Integer[] array = numbers.toArray(Integer[]::new);       
        System.out.println("Cac phan tu trong mang:");
        for (Integer num : array) {
            System.out.println(num);
        }
    }
}
