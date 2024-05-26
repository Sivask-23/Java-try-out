//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class link1 {
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
    public int getSize(){
        int s=0;
        if (head==null){
            return 0;
        }
        node cnode = head;
        while (cnode!=null){
            cnode=cnode.next;
            s++;
        }
        return s;
    }
    public node remNthfromrear(int n){
        int size=getSize();
        if(head==null){
            return null;
        }
        if (n==size){
            node c=head;
            System.out.println(c.val);
        }
        node prevnode=head;
        int prevpos=size-n;
        int i=1;
        while (i<prevpos){
            prevnode=prevnode.next;
            i++;
        }
        prevnode.next=prevnode.next.next;
        return head;

    }
    public static void main(String[] args) {

        link1 l1=new link1();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.printList();
//        int k=l1.getSize();
//        System.out.println("size="+k);
       l1.remNthfromrear(3);
       l1.printList(); //removes the nth pos elemnt from rear side [size-n]


    }
}