import java.util.Stack;
public class Main {
    public static void pushatbottom(int data, Stack<Integer> s){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        // remove
        int top=s.pop();
        pushatbottom(data,s);
        // add
        s.push(top);
    }

    public static void Reverse(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }

        // remove
        int top=s.pop();
        Reverse(s);

        // add to bottom
        pushatbottom(top,s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        Reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}