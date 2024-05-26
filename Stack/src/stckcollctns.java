import java.util.Stack;

public class stckcollctns {
    public static void main(String[] args){
        Stack<Integer> st =new Stack<>();
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

    }
}
