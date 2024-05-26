public class linklist {
    node head;
    class node{
        int val;
       node next;
        node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public void addLast(int val){
        node newNode= new node(val);
        if(head==null){
            head=newNode;
            return;
        }
       node curNode=head;
        while (curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }

    public void printList(){
        if (head==null){
            System.out.println("List Empty");
            return;
        }
        node curNode =head;
        while (curNode!=null){
            System.out.print(curNode.val+"->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }
    public void delAtPos(int p){
        int pos=p;
        if (head==null){
            System.out.println("List empty");
            return;
        }
        if(pos==1){
            head=head.next;
            return;
        }

        int i=1;
        node prevNode=head;
        while (i<pos-1){
            prevNode=prevNode.next;
            i++;
        }
        prevNode.next=prevNode.next.next;

    }
    public void addAtpos(int p, int val){
        node newNode=new node(val);
        int pos=p;
        if (head==null){
            head=newNode;
            return;
        }
        if (pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        node pnode=head;
        int i=1;
        while (i<pos-1){
            pnode=pnode.next;
            i++;
        }
        newNode.next=pnode.next;
        pnode.next=newNode;

    }
    public int getsize(){
        if (head==null){
            System.out.println("list Empty");
            return 0;
        }
        int si=0;
        node cnode=head;
        while (cnode!=null){
            cnode=cnode.next;
            si++;
        }
        return si;
    }
    public static void main(String[] args){
        linklist l1=new linklist();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.printList();
        l1.delAtPos(4);
        l1.printList();
        l1.addAtpos(1,10);
        //l1.delAtPos(1);
        l1.printList();
        System.out.println(l1.getsize());

    }
}
