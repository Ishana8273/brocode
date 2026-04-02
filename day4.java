//class Student{
//   void display(){
//       System.out.println("hello Student");
//    }
//}
//
//class Person extends Student{
//    @Override
//    void display() {
//        super.display();
//
//        System.out.println("Hello Person");
//    }
//}

import java.util.*;
public class day4  {

    public static void main(String[] args) {

        Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());

        queue.offer(2.0);
        queue.offer(4.0);
        queue.offer(3.5);
        queue.offer(2.0);
        queue.offer(1.5);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
