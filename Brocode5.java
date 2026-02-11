import java.util.Scanner;

 class Add {
     int x ;
     int y;

     void fun(){
        x = x + x;;
        System.out.println(x);
    }

    void fun2(){
         y=y+y;;
         System.out.println(y);

     }
        }

public class Brocode5 {

    public static void main(String[] args){
        Add m1 = new Add();
        m1.fun();
        m1.x=5;
        m1.fun();
        m1.fun2();
        m1.y=10;
        m1.fun2();



//        Shopping Cart

        Scanner scanner = new Scanner(System.in);

//        String item;
//        double price;
//        int quantity;
//        char currency = '$';
//        double total;
//
//        System.out.print("What item would you like to buy?: ");
//        item = scanner.nextLine();
//
//        System.out.print("What is the price of the item?: ");
//        price = scanner.nextDouble();
//
//        System.out.print("how many would you like?: ");
//        quantity = scanner.nextInt();
//
//        total = price * quantity;
//
//        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
//        System.out.println("Your total is " + currency + total);;







      scanner.close();
    }
}
