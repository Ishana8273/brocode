import java.util.Scanner;

interface Greeting{

     default void sayHello(){
        System.out.println("Hello");
    }

    default void sayGoodBye(){
        System.out.println("GoodBye!..");
    }

    private void printMessage(String msg){
        System.out.println("msg");
    }
}

class Main2 implements Greeting{

}

public class Main1 {
    public static void main(String[] args) {
        Main2 greeter = new Main2();
        greeter.sayHello();
        greeter.sayGoodBye();
    }
}


//
//
//public class Main1 {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner (System.in);
//        String name = "";
//
//      do {
//            System.out.println("Enter your name :");
//            name = scanner.nextLine();
//        } while(!name.isBlank());
//        System.out.println("hello "+name);
//    }
//}
