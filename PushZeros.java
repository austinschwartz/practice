import java.util.*;

public class PushZeros
{

    public static void pushZeros(int[] arr)
    {
        int count = 0; //count of non-zero elements
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != 0)
            {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length)
        {
            arr[count] = 0;
            count++;
        }
        return;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 0, 5, 9, 0, 3, 0, 0, 2, 4, 1, 0};
        System.out.println(Arrays.toString(arr));
        pushZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
