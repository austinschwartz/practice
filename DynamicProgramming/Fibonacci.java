/*
 * http://courses.engr.illinois.edu/cs473/notes/05-dynprog.pdf
 */

import java.util.*;
import java.lang.System;
import java.math.*;

public class Fibonacci {
    static Hashtable<Integer,Integer> MemFibos = new Hashtable<Integer, Integer>();

    public static int RecFibo(int n) {
        if (n <= 1)
            return n;
        else
            return RecFibo(n-1) + RecFibo(n-2);
    }

    public static int MemFibo(int n) {
        if (n <= 1)
            return n;
        else {
            if (MemFibos.get(n) == null)
                MemFibos.put(n, MemFibo(n-1) + MemFibo(n-2));
            return MemFibos.get(n);
        }
    }

    public static int IterFibo(int n) {
        Hashtable<Integer, Integer> IterFibos = new Hashtable<Integer, Integer>();
        IterFibos.put(0, 0);
        IterFibos.put(1, 1);
        for (int i = 2; i <= n; i++) {
            IterFibos.put(i, IterFibos.get(i-1) + IterFibos.get(i-2));
        }
        return IterFibos.get(n);
    }

    public static int IterFibo2(int n) {
        int prev = 1;
        int curr = 0;
        int next;
        for (int i = 0; i < n; i++) {
            next = curr + prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }

}
