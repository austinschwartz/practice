import java.lang.StringBuilder;

class StringReverse {

    public static String StringReverse(String str)
    {
        int len = str.length();
        char[] temp = new char[len];
        for (int i = 0; i < len; i++)
        {
            temp[i] = str.charAt(len - 1 - i);
        }
        String newStr = new String(temp);
        return newStr;
    }

    public static String StringReverse2(String str)
    {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++)
        {
            sb.append(str.charAt(length - i - 1));
        }
        return sb.toString();
    }

    public static char[] StringReverseInplace(char[] str)
    {
        for (int i = 0, j = str.length - 1; i < str.length / 2; i++, j--)
        {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        return str;
    }

    public static char[] StringReverseInplaceRecursive(char[] str)
    {
        return StringReverseInplaceRecursive(str, 0, str.length-1);
    }

    public static char[]  StringReverseInplaceRecursive(char[] str, int left, int right)
    {
        if (left >= right)
            return str;
        else
        {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            return StringReverseInplaceRecursive(str, left+1, right-1);
        }
    }

    public static void main(String[] args)
    {
        String a = "Hello this is a string.";
        System.out.println(StringReverse(a));
        System.out.println(StringReverse2(a));
        System.out.println(StringReverseInplace(a.toCharArray()));
        System.out.println(StringReverseInplaceRecursive(a.toCharArray()));
    }
}
