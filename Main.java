//import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    public void input () {


        System.out.println("Enter ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter ");
        name = scanner.nextLine();
    }

    void output(){
        System.out.println(age);
        System.out.println(name);
    }


    public static void main(String[] args) {

//
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null, "Hello " + name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
//        JOptionPane.showMessageDialog(null,"you are " +age + " years old");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
//        JOptionPane.showMessageDialog(null,"you are " + height +"cm tall");
//
//
 Scanner scanner = new Scanner(System.in);

 Main obj = new Main();
 obj.input();
 obj.output();




    }
    }

//        String binary = "11001";
//        int decimal = 0;
//        int length = binary.length();
//
//        for (int i = 0; i < length; i++) {
//            if (binary.charAt(i) == '1') {
//                int power = length - 1 - i;
//                decimal += Math.pow(2, power);
//            }
//        }
//
//        System.out.println(decimal);
//    }
//}
