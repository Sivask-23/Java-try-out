import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
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
    public static void bfsorder(node root){

        if (root==null){
            return;
        }
        Queue<node> q1=new LinkedList<>();
        q1.add(root);
        q1.add(null);
        while (!q1.isEmpty()){
            node currNode=q1.remove();
            if (currNode==null){
                System.out.println();
                if(q1.isEmpty()){
                    break;
                }
                else {
                    q1.add(null);

                }
            }
            else {
                System.out.print(currNode.data+" ");
                if (currNode.left!=null){
                    q1.add(currNode.left);
                }
                if (currNode.right!=null){
                    q1.add(currNode.right);
                }
            }
        }

    }

//    count of nodes

    public static int countofnode(node root){
        if (root==null){
            return 0;
        }
        int countofleftnode=countofnode(root.left);
        int countofrightnode=countofnode(root.right);
        return countofleftnode+countofrightnode+1;
    }
//    sum of nodes data
public static int sumofnode(node root){
    if (root==null){
        return 0;
    }
    int sumofleftnode=sumofnode(root.left);
    int sumtofrightnode=sumofnode(root.right);
    return sumofleftnode + sumtofrightnode + root.data;
}
public static int height(node root){
        if(root==null){
            return 0;
        }
        int hofleft=height(root.left);
        int hofright=height(root.right);
        int myheight=Math.max(hofleft,hofright) + 1;
        return myheight;
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
        System.out.println("BFS Order");
        bfsorder(root);
        System.out.println("No of nodes in BST is  "+ countofnode(root));
        System.out.println("Sum of values of nodes in BST is  "+ sumofnode(root));
        System.out.println("depth / height of bst is "+ height(root));
    }
}