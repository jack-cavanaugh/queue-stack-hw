interface Stack {
    public void push(int v);
    public int pop();
}

public class LinkedListStack implements Stack {
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

    public void push(int v) {
        Node new_node = new Node();
        new_node.value = v;
        new_node.next = head;
        head = new_node;
    }

    public int pop() {
        if (head == null) {
            System.out.println("Nothing to pop");
            return -1;
        }
        int value = head.value;
        head = head.next;
        return value;
    }

    public static void main(String[] args) {
        LinkedListStack linkedStack = new LinkedListStack();
        linkedStack.print();
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        linkedStack.print();
        linkedStack.pop();
        linkedStack.print();
        linkedStack.push(4);
        linkedStack.print();
        linkedStack.pop();
        linkedStack.print();
    }
}
