import java.util.*;

public class StackArray implements Stack {
    
    private int[] stk;
    private int count;
    private int max;

    public StackArray(int n) {
        count = 0;
        max = n;
        stk = new int[n];
    }

    public void push(int val) throws FullStackException {
        if (count >= max-1) throw new FullStackException();
        stk[count] = val;
        count++;
    }

    public int pop() throws EmptyStackException {
        if (count == 0) throw new EmptyStackException();
        int val = stk[count-1];
        count--;
        return val; 
    }

    public int count() {
        return count;
    }

    public String toString() {
        String a = "";
        int head = count;
        for (int i = 0; i < count; i++) {
            a += "Position " + (head-i) + " : " + stk[i] + "\n";
        }
        return a;
    }

}