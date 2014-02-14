import java.util.*;

public class ModifiedBinarySearch
{

    public static int binarySearch(int[] a, int key)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            int mid = lo + ((hi - lo) / 2);
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static int findPivotIndex(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i+1])
                return i;
        }
        return -1;
    }

    public static int findPivotBinarySearch(int[] a)
    {

    }

    public static int findRotationIndex(int[] a)
    {
        return findPivotIndex(a);
    }

    public static void main(String[] args)
    {

        int[] i = {1, 2, 3, 4, 5, 6, 7, 8, 25, 259, 300, 2595, 5395395};
        System.out.println(Arrays.toString(i));
        System.out.println("Binary Search on 300: " + binarySearch(i, 300) + "\n");

        int[] a = {1, 2, 3, 4, 5, 8, 25, 249, 58, 35, 2};
        System.out.println(Arrays.toString(a));
        System.out.println("Pivot: " + findPivotIndex(a) + " which is " + a[findPivotIndex(a)]+ "\n");
        System.out.println("Pivot: " + findPivotBinarySearch(a) + " which is " + a[findPivotBinarySearch(a)]+ "\n");

        int[] b = {5, 7, 10, 25, 50, 393, 2, 3, 4};
        System.out.println(Arrays.toString(b));
        System.out.println("Rotation: " + findRotationIndex(b) + " which is " + b[findRotationIndex(b)]);

    }
}
