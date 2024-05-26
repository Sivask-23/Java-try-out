
public class ll {
    node head;
    class node {

    int val;
    node next;
    node(int val){
        this.val=val;
        this.next=null;
    }

}
    public void addLast(int val){
        node newNode = new node(val);
        if (head==null){
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
            System.out.println("list empty");
            return;
        }
        node cnode=head;
        while (cnode!=null){
            System.out.print(cnode.val+"->");
            cnode=cnode.next;
        }
        System.out.println("NULL");
    }
    public node revListHead(node head){
        node prevnode=null;
        node curnode=head;
        while (curnode!=null){
            node nextnode=curnode.next;
            curnode.next=prevnode;
            // update
            prevnode=curnode;
            curnode=nextnode;
        }
        return prevnode;
    }

    public node findMiddle(node head){
        node hare=head;
        node turtle=head;
        while (hare.next!=null && hare.next.next!=null){
            hare=hare.next.next; //2step at a time
            turtle=turtle.next; // single step at a time
        }
        return turtle;

    }
    public boolean isPalindrome(node head){
        if (head==null || head.next==null){
            return true;
        }
        node middle=findMiddle(head);
        node sechalfnode=revListHead(middle.next);
        node firsthalfnode=head;
        while (sechalfnode!=null){
            if (firsthalfnode.val!=sechalfnode.val){
                return false;
            }
            firsthalfnode=firsthalfnode.next;
            sechalfnode=sechalfnode.next;
        }
        return true;


    }

    public static void main(String[] args) {

        ll l1=new ll();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(2);
        l1.addLast(1);
        l1.printList();
        System.out.println(l1.isPalindrome(l1.head));

    }
}