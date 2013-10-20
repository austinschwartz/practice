public class TestStackArray {

    public void test1() throws Exception {
        StackArray stack = new StackArray(5);
        stack.push(5);
        stack.push(2);
        stack.push(3);
        //System.out.println(stack.toString());
        int val = stack.pop();
        if (val != 3) throw new Exception("Expected 3, got " + val);
        System.out.println("Test 'test1' passes!");
    }

    public void test2() throws Exception {
        StackArray stack = new StackArray(1);
        try {
            stack.push(5);
            stack.push(2);
        } catch (FullStackException e) {
            System.out.println("Test 'test2' passes!");
            return;
        }
        throw new Exception("No exception was thrown when overloading stack");
    }

    public void test3() throws Exception {
        StackArray stack = new StackArray(5);
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Test 'test3' passes!");
            return;
        }
        throw new Exception("No exception was thrown when popping empty stack");
    }

    public static void main(String[] args) {
        String[] testList = new String[]{"test1", "test2", "test3"};
        TestStackArray test = new TestStackArray();

        for (String arg : testList) {
            try {
                if (arg.equals("test1")) test.test1();
                if (arg.equals("test2")) test.test2();
                if (arg.equals("test3")) test.test3();
            } catch (Exception e) {
                System.out.println("Test '" + arg + "' broke with error " + e.toString());
            }
        }
    }
}