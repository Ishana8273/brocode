import java.util.Scanner;

public class Brocode {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();

        System.out.print("What is your Gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " +name);
        System.out.println("you are " +age+ " Years old");
        System.out.println("your gpa is: " +gpa);
//        System.out.println("Student: " +isStudent);

        if (isStudent){
            System.out.println("Student is Enrolled");
        }
        else {
            System.out.println("Student is Not Enrolled");
        }




    }
}
