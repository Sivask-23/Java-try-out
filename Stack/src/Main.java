//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    static class Stack{

        public static Node head;// this is static bcs stack should have only one head
        public  boolean isEmpty(){
            return head==null;
        }
        public  void push(int val){
            Node newNode=new Node(val);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public  int pop(){
            int top=head.val;

            if (isEmpty()){
                System.out.println("Stack Empty");
                return -1;
            }
            head=head.next;
            return top;
        }

        public  int peek(){
            if (isEmpty()){
                System.out.println("Stack Empty");
                return -1;
            }
            return head.val;
        }

    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }


        }
}