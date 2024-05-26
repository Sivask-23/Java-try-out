import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class Queue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        public boolean isempty(){
            return s1.isEmpty();
        }
        public void add(int val){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(val); // insert data while first stack becomes empty
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int rem(){
            if (isempty()){
                System.out.println("empty");
                return -1;
            }
            return s1.pop();
        }
    }
    public static void main(String[] args) {

        Queue q=new Queue();
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        while (!q.isempty()){
            System.out.println(q.s1.peek());
            q.s1.pop();
        }
    }
}