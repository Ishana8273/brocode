import java.util.*;

public class Day1 {
    public static void main(String[] args) {

        System.out.println();

        ArrayList<ArrayList<String>> grocerylist = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("don'ts");
        bakeryList.add("chocolate");
        bakeryList.add("toffee");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("bread");
        produceList.add("peas");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("coffee");

        grocerylist.add(bakeryList);
        grocerylist.add(produceList);
        grocerylist.add(drinkList);

        System.out.println( grocerylist);
        System.out.println();
        System.out.println(grocerylist.get(0).get(2));
        System.out.println(grocerylist.get(1));

    }}
