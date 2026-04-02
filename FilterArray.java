import java.util.ArrayList;

public class FilterArray {

    public static void main(String[] args) {
        ArrayList<Integer> ar =new ArrayList<>();

        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        ar.add(60);


        ar.stream()
                .filter(n->n>15)
        .forEach(System.out::println);

    }
}
