//java collection Framwork

import java.util.*;

public class JCF {
    public static void main(String[] args) {

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(70);
        stack.push(50);
        System.out.println(stack.pop());

        // Queue
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        System.out.println(q.poll());

        // ArrayList
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        System.out.println(list);

        // Set
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored
        System.out.println(set);

        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println(map.get(1));

    }
}