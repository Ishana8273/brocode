import java.util.ArrayList;

public class Contains {

        public static void main(String[] args) {
            ArrayList<String> str = new ArrayList<>();

            str.add("Tarun");
            str.add("Shijo");
            str.add("Vansh");

            str.stream().filter(name->name.contains("i")).forEach(System.out::println);
        }
    }


