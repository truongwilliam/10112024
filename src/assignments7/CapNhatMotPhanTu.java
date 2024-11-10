package assignments7;
import java.util.ArrayList;

public class CapNhatMotPhanTu {
   public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
       
        numbers.set(2, 100);  
        System.out.println("Danh sach sau khi cap nhat lai: " + numbers);
    } 
}
