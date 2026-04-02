import java.lang.reflect.Array;
import java.util.ArrayList;

public class DivisiblityFilter {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(18);
        list.add(30);
        list.add(15);

        list.stream().filter(n-> n%3==0 && n%5!=0).forEach(System.out::println);
    }
}
