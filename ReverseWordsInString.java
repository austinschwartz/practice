public class ReverseWordsInString
{

    public static String reverseWords(String a)
    {
        char[] arr = a.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        if (right > 1)
        {
            arr = reverseString(arr, 0, right);

            for (right = 0; right <= arr.length; right++)
            {
                if (arr[right] == ' ' || right == arr.length)
                {
                    arr = reverseString(arr, left, right-1);
                    left = right + 1;
                }
            }
        }
        return new String(arr);
    }

    public static char[] reverseString(char[] str, int left, int right)
    {
        char temp;
        while (left < right)
        {
            temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        return str;
    }

    public static void main(String[] args)
    {
        String a = "Hello this is a test ok thanks";
        String b = reverseWords(a);
        System.out.println(a);
        System.out.println(b);

    }
}
