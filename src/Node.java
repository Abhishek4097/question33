public class Node {
    Node next;
    int data;
    int priority;
    public Node(int data, int priority)
    {
        this.data = data;
        this.priority = priority;
    }
}
class PriorityQueueLinkedList {
    Node front;
    Node rear;

    public PriorityQueueLinkedList() {
        front = null;
        rear = null;

    }

    public void enqueue(Node newnode) {
        if (front == null || newnode.priority < front.priority) {
            newnode.next = front;
            front = newnode;
        } else {
            Node temp = front;

            while (temp.next != null && temp.next.priority <= newnode.priority) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;

        }
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data + " " + temp.priority);
            temp = temp.next;
        }
    }
}
class PriorityQueueLinkedListMain {
    public static void main(String[] args) {
        // Creation of the node class object
        Node n1= new Node(15,4);
        Node n2 = new Node(10,3);
        Node n3 = new Node(20,3);
        PriorityQueueLinkedList obj = new  PriorityQueueLinkedList();
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        obj.display();

    }
}
