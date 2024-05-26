import java.util.ArrayList;

public class stackarraylist {
   static class stack{
        ArrayList<Integer> list=new ArrayList<>();
        public boolean isemp(){
            return list.size()==0;
        }
        public void push(int val){
            list.add(val);
        }

        public int pop() {
            if (isemp()){
                System.out.println("stack empty");
                return -1;
            }
                int top = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                return top;
        }

        public int peek(){
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args){
        stack st1 =new stack();
        st1.push(2);
        st1.push(4);
        st1.push(6);
        st1.push(8);

        while (!st1.isemp()){
            System.out.println(st1.peek());
            st1.pop();
        }

    }
}
