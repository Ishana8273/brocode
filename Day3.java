import java.util.Scanner;
import java.util.Vector;

//public class Day3 {
//    public static void main(String[] args) {
//
//        //Scanner scanner = new Scanner(System.in);
//            Vector<String> v1 = new Vector<>();
//
//            v1.add("Vansh Malik");
//            v1.add("Tushar Sahlot");
//            v1.add("vansh garg");
//        System.out.println(v1);
//        v1.remove(1);
//        v1.set(0,"vansh malik");
//        System.out.println(v1);
//        System.out.println(v1.capacity());
//        System.out.println(v1.contains("vansh malik"));
//        System.out.println(v1.isEmpty());
//        for(int i = 0; i < v1.size(); i++) {
//            System.out.println(v1.get(i));
//
//        }
//        System.out.println();
//
//        for (String v2 : v1){
//            System.out.println(v2);
//        }
//
//    }
//}


public class Day3 {
    public static void main(String[] args) {

        String name = "Vansh Malik";
        String temp = " ";

        for ( int i = name.length()-1;i>=0;i--){

            temp = temp+name.charAt(i);
            System.out.println(temp);
        }


    }
}





















