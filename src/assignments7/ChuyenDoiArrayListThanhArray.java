package assignments7;
import java.util.ArrayList;
class NumberList{
    private final ArrayList<Integer> list;
    public NumberList() {
        list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
    public void removeNumber(int number) {
        list.remove(Integer.valueOf(number));
    }
    public void printList() {
        System.out.println(list);
    }
}
public class ChuyenDoiArrayListThanhArray {
    public static void main(String[] args) {
        NumberList numberList = new NumberList();
        numberList.printList();
        numberList.removeNumber(5);
        numberList.printList();
    }
}
