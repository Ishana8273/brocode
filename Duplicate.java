import java.util.List;

public class Duplicate {
    public static void main(String[] args) {

        List<Integer> list = List.of(10,20,20,30,30,40,40,50,51,52,53);

        List<Integer> result = list.stream().distinct().limit(5).skip(3).toList();

        long total = result.stream().count();

        System.out.println(result);
        System.out.println(total);


    }
}
