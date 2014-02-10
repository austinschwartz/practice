import java.util.*;

public class GraphTraversals
{

    public static BinaryTree newNode(int val)
    {
        BinaryTree node = new BinaryTree(val);
        return node;
    }

    public static int height(BinaryTree root)
    {
        if (root == null)
            return 0;
        else
        {
            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight)
                return lheight + 1;
            else
                return rheight + 1;
        }
    }

    public static void PrintLevelOrder(BinaryTree root)
    {
        if (root == null) return;
        ArrayDeque<BinaryTree> current = new ArrayDeque<BinaryTree>();
        ArrayDeque<BinaryTree> next = new ArrayDeque<BinaryTree>();
        current.add(root);
        while (current.peek() != null)
        {
            BinaryTree currentNode = current.remove();
            if (currentNode != null)
            {
                System.out.print(currentNode.val + " ");
                if (currentNode.left != null)
                    next.add(currentNode.left);
                if (currentNode.right != null)
                    next.add(currentNode.right);
            }
            if (current.peek() == null)
            {
                Queue<BinaryTree> temp;
                temp = current;
                current = next;
                next = current;
            }
        }
        System.out.println();
    }

    public static void PrintLevelOrder2(BinaryTree root)
    {
        int h = height(root);
        for (int i = 1; i <= h; i++)
        {
            PrintGivenLevel(root, i, 0);
        }
        System.out.println();
    }

    public static void PrintZigZagOrder(BinaryTree root)
    {
        int h = height(root);
        int zig = 1;
        for (int i = 1; i <= h; i++)
        {
            PrintGivenLevel(root, i, zig);
            if (zig == 1)
                zig = 2;
            else
                zig = 1;
        }
        System.out.println();
    }

    public static void PrintGivenLevel(BinaryTree root, int level, int zigzag)
    {
        if (root == null)
        {
            return;
        }
        if (level == 1)
            System.out.print(root.val + " ");
        else if (level > 1)
        {
            if (zigzag == 0)
            {
                PrintGivenLevel(root.left, level-1, 0);
                PrintGivenLevel(root.right, level-1, 0);
            }
            else
            {
                if (zigzag == 1)
                {
                    PrintGivenLevel(root.left, level-1, 1);
                    PrintGivenLevel(root.right, level-1, 1);
                }
                else if (zigzag == 2)
                {
                    PrintGivenLevel(root.right, level-1, 2);
                    PrintGivenLevel(root.left, level-1, 2);
                }
            }
       }
        return;
    }

    public static void main(String[] args)
    {
        BinaryTree root  = newNode(15);
        BinaryTree node  = newNode(5);
        BinaryTree node2 = newNode(3);
        BinaryTree node3 = newNode(12);
        BinaryTree node4 = newNode(10);
        BinaryTree node5 = newNode(6);
        BinaryTree node6 = newNode(7);
        BinaryTree node7 = newNode(13);
        BinaryTree node8 = newNode(16);
        BinaryTree node9 = newNode(20);
        BinaryTree node10 = newNode(18);
        BinaryTree node11 = newNode(23);

        root.left = node;
        root.right = node8;
        node.left = node2;
        node.right = node3;
        node3.left = node4;
        node3.right = node7;
        node4.left = node5;
        node5.right = node6;
        node8.right = node9;
        node9.left = node10;
        node9.right = node11;

        System.out.println("Tree height: " + height(root));
        System.out.println("Level Order");
        PrintLevelOrder(root);
        PrintLevelOrder2(root);
        System.out.println("ZigZag Order");
        PrintZigZagOrder(root);
    }
}
