

public class Main8 {
int n;
     void display(int x, int y){
       int temp= x;
       x=y;
       y=temp;
    }
}
class demo extends Main8{

    public static void main(String[] args) {
      int x=20,y=10;
      Main8 m1 = new Main8();
      m1.display(20,10);
        System.out.println("x=" +x +"y" +y);
      }

    }
