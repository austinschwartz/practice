import java.util.HashMap;
import java.math.*;

public class Fibonacci
{

    static HashMap<Integer, BigInteger> memo = new HashMap<Integer, BigInteger>();

    public static int Fibonacci(int k)
    {
        if (k <= 2)
            return 1;
        else
            return Fibonacci(k-1) + Fibonacci(k-2);
    }

    public static int Fibonacci2(int k)
    {
        int temp = 0;
        int a = 1;
        int b = 1;
        for (int i = 1; i < k - 1; i++)
        {
            temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public static BigInteger Fibonacci3(int k)
    {
        if (k <= 2)
            return BigInteger.ONE;
        if (memo.get(k) == null) {
            memo.put(k, Fibonacci3(k-1).add(Fibonacci3(k-2)));
        }
        return memo.get(k);
    }

    public static void main(String[] args)
    {
        System.out.printf("%d\n", Fibonacci(5));
        System.out.printf("%d\n", Fibonacci2(5));
        System.out.printf("%d\n", Fibonacci3(5));
    }
}
