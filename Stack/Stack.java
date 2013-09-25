public interface Stack {
    public int count();
    public void push(int val) throws FullStackException;
    public int pop() throws EmptyStackException;
    public String toString();    
}