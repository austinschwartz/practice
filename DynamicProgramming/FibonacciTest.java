import java.util.*;

public class FibonacciTest {
    public static void main(String[] args) {
        if (args.length < 2)
            return;
        else {
            int n = Integer.parseInt(args[1]);
            switch (args[0]) {
                case "0":
                    System.out.println(Fibonacci.RecFibo(n));
                    break;
                case "1":
                    System.out.println(Fibonacci.MemFibo(n));
                    break;
                case "2":
                    System.out.println(Fibonacci.IterFibo(n));
                    break;
                case "3":
                    System.out.println(Fibonacci.IterFibo2(n));
                    break;
            }
        }
    }
}
