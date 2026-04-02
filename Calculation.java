import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculation {




//    void sum(int a, int b){
//
//        int result = a+b;
//        System.out.println(result);
//    }
//    void multiply(int a, int b){
//
//        int result = a*b;
//        System.out.println(result);
//    }

//    Calculation(String model,int year,double price){
//        System.out.println(model);
//        System.out.println(year);
//        System.out.println(price);
//
//    }

    public static void main(String[] args) {
//        Calculation m1 = new Calculation();
        Scanner sc = new Scanner(System.in);
        int a=0; int b=1;
        System.out.println("enter");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){

            int next = a+b;
            System.out.println(a + " ");
            a=b;
            b=next;

        }
        System.out.println(" ");

    }

}
