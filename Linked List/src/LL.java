import java.util.Scanner;

class LL {
    node head;
    private int size;
    LL(){
        this.size=0;
    }
    class node{
        String data;
        node next;
        node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
//    add -first,last,middle
//     add first

     public void addFirst(String data){
        node newNode = new node(data);
        if (head==null){
            head=newNode;
            newNode.next=null;
            return;
        }
        newNode.next=head;
        head=newNode;
     }

//     add last

     public void addLast(String data){

        node newNode= new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        node currNode;
        currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.next=null;

     }

//     print list
     public void printList(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        node curnode=head;
        while (curnode!=null){
            System.out.print(curnode.data + "->");
            curnode=curnode.next;
        }
         System.out.println("Null");
     }
//      delete from first
     public void deleteFirst(){
        if (head==null){
            System.out.println("List Empty");
            return;
        }
        size--;
        head=head.next;
     }
//     delete from last
     public void deleteLast(){
         if (head==null){
             System.out.println("List Empty");
             return;
         }
         size--;
         if (head.next==null){
             head=null;
             return;
         }
         node SecLast=head;
         node lastNode=head.next;
         while (lastNode.next!=null){
             lastNode=lastNode.next;
             SecLast=SecLast.next;
         }
         SecLast.next=null;

     }
     public int getSize(){
        return size;
     }


    public static void main(String[] args) {
        LL list=new LL();
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            int choice;
            System.out.println("_____Linked list_____ ");
            System.out.println("1. insert first");
            System.out.println("2. insert last");
            System.out.println("3. delete first");
            System.out.println("4. delete last");
            System.out.println("5. print");
            System.out.println("6. print size");
            System.out.println("7. exit");
            System.out.println("Enter ur choice: ");
            choice= sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1: System.out.println("Enter data: ");
                        String dat=sc.nextLine();
                        list.addFirst(dat);
                        break;
                case 2: System.out.println("Enter data: ");
                    dat=sc.nextLine();
                    list.addLast(dat);
                    break;

                case 3: list.deleteFirst();
                        System.out.println("deleted succesfully");
                        break;

                case 4: list.deleteLast();
                        System.out.println("deleted succesfully");
                        break;
                case 5: list.printList();
                        break;
                case 6:
                    System.out.println("Size: "+ list.getSize());
                    break;
                case 7: return;
                default:
                    System.out.println("Enter valid key");
            }
        }

//        list.addFirst("this");
//        list.printList();
//        list.addLast("is");
//        list.addLast("a");
//        list.addLast("Linked List");
//        list.printList();
//        list.addFirst("first line");
//        list.printList();
//        list.deleteFirst();
//        list.printList();
//        list.deleteLast();
//        list.printList();


    }
}