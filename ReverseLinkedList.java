public class ReverseLinkedList
{

    public static void PrintLinkedList(Node head)
    {
        if (head == null)
        {
            System.out.println();
            return;
        }
        else
        {
            System.out.print(head.val + " ");
            PrintLinkedList(head.next);
        }
    }

    public static Node ReverseLinkedList(Node head)
    {
        if (head == null || head.next == null)
            return head;

        Node second = head.next;
        head.next = null;
        Node reverse = ReverseLinkedList(second);
        second.next = head;

        return reverse;
    }



    public static void main(String[] args)
    {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        PrintLinkedList(n1);
        PrintLinkedList(ReverseLinkedList(n1));
    }
}
