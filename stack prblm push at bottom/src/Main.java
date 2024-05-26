import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void pushAtbot(int data, Stack<Integer> st){
        if (st.isEmpty()){
            st.push(data);
            return;
        }
        //remove
        int top=st.pop();
        pushAtbot(data,st);
        // after removing add
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        pushAtbot(15,st);
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}