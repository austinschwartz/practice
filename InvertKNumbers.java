import java.util.*;

public class InvertKNumbers
{
    public static int[] invert(int[] lst, int k)
    {
        for (int i = 0; i < lst.length; i += k*2)
        {
            for (int j = 0; j < k && i+j < lst.length; j++)
            {
                lst[i+j] = -lst[i+j];
            }
        }

        return lst;
    }

    public static void main(String[] args)
    {
        int[] lst = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int k = 3;
        System.out.println(Arrays.toString(lst));

        System.out.println(Arrays.toString(invert(lst, k)));
    }
}
