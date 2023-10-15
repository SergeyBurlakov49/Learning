package Stack;

public class CharStackDemo {
    public static void main(String[] args) {
        CharStack charStack = new CharStack(5);
        for (int i = 0; i <= 5; i++){
            try {
                charStack.push('i');
            } catch (CharStack.FullStackException e) {
                System.out.println("push error");
            }
        }
        for (int i = 0; i <= 5; i++){
            try {
                System.out.println(charStack.pop());
            } catch (CharStack.EmptyStackException e) {
                System.out.println("pop error");
            }
        }
    }
}
