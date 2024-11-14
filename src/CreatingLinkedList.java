class Node
{
    int data;
    Node address;

    public Node(int data)
    {
        this.data = data;
        this.address = null;
    }
}

public class CreatingLinkedList {
    Node head, tail;
    int size;

    public void add(int d)
    {
        Node n = new Node(d);
        if(head == null)
        {
            head = tail = n;
        }
        else
        {
            tail.address = n;
            tail = n;
        }
        size++;
    }

    public void printList()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.address;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        CreatingLinkedList list = new CreatingLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("Size: " + list.size);
        list.printList();

        // Accessing the head node data and address
        System.out.println("Node 1 Data: " + list.head.data);
        System.out.println("Node 1 Address: " + list.head.address);
    }
}
