package assignments7;
import java.util.ArrayList;

public class DuyetQuaArrayList {
   public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Da Nang");
        cities.add("TP Ho Chi Minh");
        cities.add("Ha Noi");
        cities.add("Hue");
        cities.add("Nha Trang");

        for (String city : cities) {
            System.out.println(city);
        }
    }
} 

