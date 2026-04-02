import java.util.Scanner;

class MathFunction{
    int count;
    void Fib(int n){

        int a = 0;
        int b = 1;
        int i =1;
        while (i <= n) {
            int temp = a+b;
            a =b;
            b = temp;
            i++;
        }
        System.out.println("Fibonacci number is "+b +" at " +n);
    }
    void Reverse(int n){
        int rev = 0;
        int rem;
        while(n>0){
            rem = n%10;
            n=n/10;
            rev = rev*10+rem;

        }
        System.out.println(rev);

    }
int Occurance(int n,int y){
        count = 0;
        int rem =0;

        while(n>0){
            rem = n%10;
            if(rem == y)
            count++;
            n =n/10;


        }
    return count;
//    System.out.println(count);
    }

}

public class Reminder {
    public static void main(String[] args) {
        MathFunction m1 = new MathFunction();
        m1.Fib(6);
        m1.Reverse(23456);
        int ans =m1.Occurance(233463,3);
        System.out.println(ans);

    }
}
