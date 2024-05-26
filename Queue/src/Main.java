//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class Que {
        static int[] arr;
        static int size;
        static int rear = -1;

        Que(int size) {
            arr = new int[size];
            this.size = size;
        }

        public boolean isempty() {
            return rear == -1;
        }
        public void add(int data){
            if (rear==size-1){
                System.out.println("Q full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        public int rem(){
            if (isempty()){
                System.out.println("Q empty");
                return -1;
            }
            int front=arr[0]; // assigning first elemnt to front to be removed
            for (int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        public int peek(){
            if (isempty()){
                System.out.println("Empty Q");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Que q=new Que(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isempty()){
            System.out.println(q.peek());
            q.rem();
        }
    }
}