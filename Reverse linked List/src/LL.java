

import java.util.LinkedList;
import java.util.List;

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

    public void revIterate(){
            if(head==null || head.next== null){
                return;
            }
        node prevNode=head;
        node curNode=head.next;
        while (curNode!=null){
            node nextnode=curNode.next;
            curNode.next=prevNode;

//            update prev,currnt and next

            prevNode=curNode;
            curNode=nextnode;
        }
//          final condtn
        head.next=null;
        head=prevNode;

    }

    public node revReccurence(node head){
            if(head==null|| head.next==null){
                return head;
            }
            node newHead=revReccurence(head.next);
            head.next.next=head;
            head.next=null;
            return newHead;
    }
    public static void main(String[] args) {
            LL list=new LL();
            list.addLast("S");
        list.addLast("i");
        list.addLast("v");
        list.addLast("a");
        list.printList();
//        list.revIterate();
//        list.printList();
        list.head= list.revReccurence(list.head);
        list.printList();

    }
}