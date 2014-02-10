import java.util.*;

public class MergeArrays
{
    public static int[] MergeArrays(int[] a, int[] b)
    {
        int c[] = new int[a.length + b.length];

        int i = 0; int j = 0; int k = 0;
        while (i < a.length && j < b.length)
        {
            if (a[i] < b[j])
            {
                c[k++] =  a[i++];
            }
            else
            {
                c[k++] = b[j++];
            }
        }

        while (i < a.length)
        {
            c[k++] = a[i++];
        }

        while (j < b.length)
        {
            c[k++] = b[j++];
        }

        return c;
    }

    public static void main(String[] args)
    {
        int arr1[] = {1, 5, 23, 30, 38, 45, 58, 109, 200, 1944};
        int arr2[] = {6, 29, 34, 59, 60, 61, 20000};
        int arr3[] = MergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
