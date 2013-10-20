import java.lang.System;
import java.util.*;
import java.math.*;

public class Memoization {
    
    static Hashtable<Integer, BigInteger> factorials = new Hashtable<Integer, BigInteger>();
    
    public static BigInteger fact(int n) {
        if (n == 1) 
            return BigInteger.ONE;
        else 
            return (new BigInteger(Integer.toString(n)).multiply(fact(n-1)));
    }
    
    public static BigInteger fact2(int n) {
        
        BigInteger x = factorials.get(n);
        if (x != null) 
            return x;
        if (n <= 1) 
            return BigInteger.ONE;
        
        BigInteger j = new BigInteger(Integer.toString(n));
        factorials.put(n, j.multiply(fact2(n-1)));
        return factorials.get(n);
    }
    
    public static void main(String[] args) {
        System.out.println(fact(100));
        System.out.println(fact(99));
        System.out.println(fact(98));
        System.out.println(fact(97));
    }
}