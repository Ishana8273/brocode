import java.util.Scanner;

public class Brocode3 {

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
//        MAD LIBS

        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter an adjective(Descriptive): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal 0r person): ");
        noun = scanner.nextLine();
        System.out.print("Enter an adjective(Descriptive): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter an verb -ing (action): ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective(Descriptive): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today i went to a " +adjective1 + " zoo");
        System.out.println("In a exhibit I saw a " +noun + ".");
        System.out.println(noun +" was " + adjective2 + " and " + verb + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();







    }
}
