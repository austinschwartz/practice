import java.util.*;

public class FrogJumps
{
    public static void frogJump(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        int jumps = 0;
        ArrayList<Integer> locations = new ArrayList<Integer>();
        locations.add(i + 1);

        int max;
        while (i < n)
        {
            jumps++;
            max = i + 1;
            for (int j = 1; j < n-i && j <= arr[i]; j++)
            {
                if (arr[i + j]  + j > arr[max])
                    max = i + j;;
            }
            i = max;
            if (i < n)
                locations.add(i + 1);
        }
        System.out.println("for " + Arrays.toString(arr) + ", Mip makes " + jumps + " jumps visiting locations " + locations.toString());

    }



    public static void main(String[] args)
    {
        int[] test1 = {1, 5, 4, 6, 9, 3, 0, 0, 1, 3};
        int[] test2 = {2, 8, 3, 6, 9, 3, 0, 0, 1, 3};
        int[] test3 = {1, 1, 1, 1, 25, 1, 1, 1, 1, 1};
        frogJump(test1);
        frogJump(test2);
        frogJump(test3);
    }
}
