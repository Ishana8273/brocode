//import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
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

 String name;

        System.out.println("Enter ");
        name = scanner.next();

        if(name.equals("q") || name.equals("Q")){
            System.out.println("Quit the game");
        }
        else{
            System.out.println("you are now playing");
        }


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
