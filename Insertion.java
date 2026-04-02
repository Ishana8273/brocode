
class Node {
    int data;
    Node next, prev;

    Node(int new_data) {
        data = new_data;
        next = prev = null;
    }
}

class Insertion {

    static Node insertAtPos(Node head, int pos, int new_data) {

        Node new_node = new Node(new_data);

        if (pos == 1) {
            new_node.next = head;

            if (head != null)
                head.prev = new_node;

            head = new_node;
            return head;
        }

        Node curr = head;

        for (int i = 0; i < pos - 2 && curr != null; ++i) {
            curr = curr.next;
        }

        if (curr == null) {
            return head;
        }

        new_node.prev = curr;

        new_node.next = curr.next;

        curr.next = new_node;

        if (new_node.next != null)
            new_node.next.prev = new_node;


        return head;
    }


    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" <-> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(4);
        head.next.next.prev = head.next;

        // Insert new node with data 3 at position 3

        head = insertAtPos(head, 3, 15);
        head = insertAtPos(head, 1, 10);
        head = insertAtPos(head, 1, 13);

        printList(head);
    }
}