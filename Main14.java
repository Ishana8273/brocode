import java.util.*;
import java.util.stream.*;

public class Main14
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("vansh");
        list.add("malik");

        List<String> result = list.stream().map(name->Character
                        .toUpperCase(name.charAt(0))+name.substring(1))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}