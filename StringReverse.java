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

    public static void main(String[] args)
    {
        String a = "Hello this is a string.";
        System.out.println(StringReverse(a));
        System.out.println(StringReverse2(a));
    }
}
