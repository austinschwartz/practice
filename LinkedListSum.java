public class LinkedListSum
{

    public static String nodeToString(Node root)
    {
        if (root == null)
            return "";
        else
        {
            return root.val + " " +  nodeToString(root.next);
        }

    }

    public static int sumLinkedLists(Node a, Node b)
    {
        return 1;
    }

    public static void reverseLinkedList1(Node a)
    {
        reverseLinkedList1(a, null);
    }

    public static Node reverseLinkedList1(Node a, Node previous)
    {
        Node temp;
        if (a.next == null)
        {
            a.next = previous;
            return a;
        }
        else
        {
            temp = reverseLinkedList1(a.next, a);
            a.next = previous;
            return temp;
        }
    }

    public static Node reverseLinkedList2(Node a)
    {
        Node temp;
        Node previous = null;
        while (a != null)
        {
            temp = a.next;
            a.next = previous;
            previous = a;
            a = temp;
        }
        return previous;
    }

    public static void main(String[] args)
    {
        Node anode1 = new Node(1);
        Node anode2 = new Node(2);
        Node anode3 = new Node(3);
        anode1.next = anode2;
        anode2.next = anode3;
        System.out.println(nodeToString(anode1));
        reverseLinkedList1(anode1);
        System.out.println(nodeToString(anode3) + "\n");

        Node bnode1 = new Node(2);
        Node bnode2 = new Node(3);
        Node bnode3 = new Node(4);
        bnode1.next = bnode2;
        bnode2.next = bnode3;
        System.out.println(nodeToString(bnode1) + "\n");

        Node cnode1 = new Node(3);
        Node cnode2 = new Node(4);
        Node cnode3 = new Node(5);
        Node cnode4 = new Node(6);
        Node cnode5 = new Node(7);
        cnode1.next = cnode2;
        cnode2.next = cnode3;
        cnode3.next = cnode4;
        cnode4.next = cnode5;
        System.out.println(nodeToString(cnode1) + "\n");


        System.out.println(sumLinkedLists(anode1, anode2));
    }
}
