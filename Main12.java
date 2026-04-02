import java.util.*;
import java.util.stream.*;

public class Main12
{
    public static void main(String[] args) {
        List<Integer> list=  new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> result= list.stream().map(x->x*2).collect(Collectors.toList());

        System.out.println(result);
    }
}