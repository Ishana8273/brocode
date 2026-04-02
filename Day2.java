import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.println("Enter your marks(1-100): ");
        num = scanner.nextInt();

        String result = switch(num/10) {

            case 9,10 -> {
                System.out.println("Your grade is A");
                yield "A";
            }

            case 8 -> {
                System.out.println("Your grade is B");
                yield "B";
            }
        case 7 ->    {
                System.out.println("Your grade is C");
                yield "C";
            }

            case 6 -> {
                System.out.println("Your grade is D");
                yield "D";
            }

             default -> {
                 System.out.println("You are Fail");
                 yield "F";
             }

        };
        System.out.println(result);

    }
}
