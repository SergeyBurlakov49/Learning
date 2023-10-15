package Stack;

public class CharStack {

    private char [] stack;
    private int top;

    public CharStack(int space){
        if (space <= 0) stack = new char[1];
        else stack = new char[space];
        top = -1;
    }

    public char pop() throws EmptyStackException {
        if (top < 0) throw new EmptyStackException();
        top--;
        return stack[top + 1];
    }

    public void push(char ch) throws FullStackException {
        if (top + 1 >= stack.length) throw new FullStackException();
        top++;
        stack[top] = ch;
    }

    public class EmptyStackException extends Exception{
    }

    public class FullStackException extends Exception{
    }

}
