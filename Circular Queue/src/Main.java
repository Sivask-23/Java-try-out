//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear=-1;
        static int front=-1;
        Queue(int size){
            arr=new int[size];
            this.size=size;

        }
        public boolean isempty(){
            return (rear==-1 && front==-1);
        }
        public boolean isfull(){
            return (rear+1)==front;
        }

        public void add(int data){
            if (isfull()){
                System.out.println(" full");
                return;
            }
            if (front==-1){  // single elemnt
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public int rem(){
            if (isempty()){
                return -1;
            }
            int res=arr[front];
            // if only oneelemnt
            if (front==rear){
                front=-1;
                rear=-1;
            }
            else {
                front=(front+1)%size;
            }
            return res;
        }

        public int peek(){
            if (isempty()){
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.rem();
        q.add(6);
        q.rem();
        q.add(7);
        while (!q.isempty()){
            System.out.println(q.peek());
            q.rem();
        }

    }
}