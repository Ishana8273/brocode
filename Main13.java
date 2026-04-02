import java.util.*;
import java.util.stream.*;

public class Main13 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("vansh");
        list.add("malik");

        List<String> result = list.stream().map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}