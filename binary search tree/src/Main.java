//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   static class node{
        int data;
        node left = null;
        node right = null;
        node(int data){
            this.data=data;
        }
    }
     static class BinaryTree{
        static int idx=-1;
        public static node buildTree(int nodes[]){  //input data of nodes and return root node
            idx++;
            if (nodes[idx]==-1){
                return null;
            }
            node newNode=new node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;

        }

    }
    public static void preordr(node root){
       if(root == null){
           return;
       }
        System.out.print(root.data+" ");
        preordr(root.left);
        preordr(root.right);
    }
    public static void inordr(node root){
        if(root == null){
            return;
        }
        inordr(root.left);
        System.out.print(root.data+" ");
        inordr(root.right);
    }
    public static void postordr(node root){
        if(root == null){
            return;
        }
        postordr(root.left);
        postordr(root.right);
        System.out.print(root.data+" ");

    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
                                                //store root node that returned from functn
        node root = BinaryTree.buildTree(nodes);
        System.out.println(root.data);
        preordr(root);
        System.out.println();
        inordr(root);
        System.out.println();
        postordr(root);
    }
}