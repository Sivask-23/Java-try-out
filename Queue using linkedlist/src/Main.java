//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        static class Queue{
            static node head=null;
            static node tail=null;


            public boolean isempty(){
                return (head==null && tail==null);
            }
            public void add(int data){
                node newNode= new node(data);
                if (isempty()){
                    head=tail=newNode;
                    return;
                }
                tail.next=newNode;
                tail=newNode; // act as rear pointer
            }

            public int remove(){
                if (isempty()){
                    return -1;
                }
                int front=head.data;
                if (head==tail){
                    head=tail=null;
                    return -1;
                }
                head=head.next;
                return front;
            }

            public int peek(){
                if (isempty()){
                    return -1;
                }
                return head.data;
            }
        }

    public static void main(String[] args) {

        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        while (!q.isempty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}