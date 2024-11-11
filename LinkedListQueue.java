interface Queue {
    public void enqueue(int v);
    public int dequeue();
} 

public class LinkedListQueue implements Queue {
    public class Node {
        public int value;
        public Node next = null;
    }
    public Node head;

    public void print() { // For testing
        Node current = head;
        if (head == null) {
            System.out.println("Your stack is empty");
        }
        else {
            System.out.print("[");
            while (current.next != null) {
                System.out.print(current.value + ",");
                current = current.next;
            }
            System.out.print(current.value + "]");  
        } 
    }

    public void enqueue(int v) {
        Node new_node = new Node();
        new_node.value = v;
        if (head == null) {
            head = new_node;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new_node;
    }

    public int dequeue() {
        if (head == null) {
            System.out.println("Nothing to dequeue");
            return -1;
        }
        Node to_dequeue = head;
        head = to_dequeue.next;
        to_dequeue.next = null;
        return to_dequeue.value;
    }
    public static void main(String[] args) {
        LinkedListQueue linkedQueue = new LinkedListQueue();
        linkedQueue.print();
        linkedQueue.enqueue(1);
        linkedQueue.print();
        linkedQueue.enqueue(2);
        linkedQueue.print();
        linkedQueue.enqueue(3);
        linkedQueue.print();
        linkedQueue.dequeue();
        linkedQueue.print();
        linkedQueue.dequeue();
        linkedQueue.print();
        linkedQueue.dequeue();
        linkedQueue.print();
        linkedQueue.dequeue();
        linkedQueue.print();
    }
}
