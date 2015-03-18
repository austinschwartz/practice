public class Permutations
{

    public static void swap(char[] arr, int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printPermutations(char[] str, int start, int end)
    {
        int i;
        if (start == end)
            System.out.println(str);
        else
        {
            for (i = start; i <= end; i++)
            {
                swap(str, start, i);
                printPermutations(str, start+1, end);
                swap(str, start, i);
            }
        }
    }

    public static void main(String[] args)
    {
        String a = "ABC";
        String b = "AEIOU";
        System.out.println(a);
        System.out.println(b);
        printPermutations(a.toCharArray(), 0, a.length()-1);
        printPermutations(b.toCharArray(), 0, b.length()-1);

    }
}
