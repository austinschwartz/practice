public class Subset
{
    public static void subset(int[] a, int n)
    {
        int np = 1 << n;
        for (int i = 1; i < np; i++)
        {
            int bitv = i;
            int pos = 0;
            while (bitv > 0)
            {
                if ((bitv & 1) == 1)
                    System.out.print(a[pos] + " ");

                bitv >>= 1;
                pos++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        int[] arr = {5, 4, 2};
        subset(arr, arr.length);
    }
}

