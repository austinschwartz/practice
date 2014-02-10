import java.util.*;

public class MaxIntegers
{

    public static int[] returnMaxKIntegers(int[] arr, int k)
    {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k);
        int indx = 0;
        for (int j = 0; j < k; j++)
        {
            queue.add(arr[j]);
        }

        for (int i = k; i < arr.length; i++)
        {
            if (queue.peek() < arr[i])
            {
                queue.poll();
                queue.add(arr[i]);
            }
        }
        int[] max = new int[k];
        for (int h = 0; h < k; h++)
        {
            max[h] = queue.poll();
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] arr = {5, 4, 2, 45, 345, 2983, 23, 43, 384, 234, 989834, 238, 12, 129, 239, 1298, 237};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(returnMaxKIntegers(arr, 5)));
    }
}
