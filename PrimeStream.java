import java.util.ArrayList;

public class PrimeStream {
    static boolean isPrime(int n){
        int count =0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
            count++;
            }

        }
        if(count>2)
            return false;
        else return true;

    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(6);


        list.stream().filter(nums->isPrime(nums)).forEach(System.out::println);


    }
}
