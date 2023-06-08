package Stack;

public class MyStack {
    private String stackElement [];
    private int counter;
    public MyStack(int size) {
      stackElement = new String[size];
    }

    public boolean isEmpty() {
        if (counter == 0) return true;
        return false;
    }

    public void push(String element) {
        stackElement[counter] = element;
        counter++;
    }

    public String pop() {
        counter--;
        return stackElement[counter];

    }
}

