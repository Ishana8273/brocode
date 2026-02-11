import java.util.Scanner;

public class Brocode2 {

    public static void main(String[] args) {

//        Calculate area of Rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Width : ");
        width = scanner.nextDouble();

        System.out.print("Enter the Height : ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.print("The area of Rectangle : " +area + "cm^2");




      scanner.close();
    }
}
