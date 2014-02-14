import java.util.*;

public class ParenthesesValidator
{

    public static boolean isValid(String a)
    {
        char[] arr = a.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (char chr : arr)
        {
            if (chr == '(')
                stack.push('(');
            if (chr == ')')
                if (stack.empty() || stack.pop() != '(')
                    return false;
        }
        if (stack.empty())
            return true;

        return false;
    }

    public static void main(String[] args)
    {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("((alf)ls)");
        strings.add(")(dkk)()");
        strings.add("))ok((");
        strings.add("(((())())(((((())))))(())())");

        for (String str : strings)
            System.out.println(str + " : " + isValid(str));
    }
}
