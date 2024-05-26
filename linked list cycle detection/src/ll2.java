//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ll2 {
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
        node newNode=new node(val);
        if (head==null){
            head=newNode;
            return;
        }
        node curnode=head;
        while (curnode.next!=null){
            curnode=curnode.next;
        }
        curnode.next=newNode;
    }

    public void printList(){
        if (head==null){
            System.out.println("list empty");
            return;
        }
        node curNode=head;
        while (curNode!=null){
            System.out.print(curNode.val+"->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }

    public boolean haveCycle(node head){
        if(head==null){
            return false;
        }
        node hare=head;
        node turtle=head;
        while (hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if (hare == turtle){    //meeting point which means cycle exists
                return true;
            }
        }
        return false; // cycle not found
    }
    public static void main(String[] args) {
        ll2 list=new ll2();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        System.out.println(list.haveCycle(list.head));
    }
}