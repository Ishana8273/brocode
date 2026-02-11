interface A {

    static void square(int n) {
        System.out.println(n * n);
    }

    static void cube(int n) {
        System.out.println(n * n * n);
    }
}

interface MathUtility {

    static void isEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

    static void isPrime(int n) {
        if (n <= 1) {
            System.out.println(n + " is prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not prime");
                return;
            }
        }
        System.out.println(n + " is prime");
    }
}

public class SubString {

    public static void main(String[] args) {

        A.square(6);
        A.cube(3);
        MathUtility.isEven(2);
        MathUtility.isPrime(6);
    }
}
