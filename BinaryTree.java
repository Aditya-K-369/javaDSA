import java.util.*;

public class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left= null;
            this.right= null;
        }
    }
    static class Binarytree {
        static int ind= -1;
        public static Node bulidNode(int nodes[]){
            ind++;
            if(nodes[ind]==-1)
                return null;
            Node newNode = new Node(nodes[ind]);
            newNode.left=bulidNode(nodes);
            newNode.right=bulidNode(nodes);
            return newNode;
        }
    }
    public static void levelorder(Node root){
        if(root==null)
        return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currentNode = q.remove();
            if(currentNode==null){
                System.out.println();
                if(q.isEmpty())
                break;
                else
                q.add(null);
            }else{
                System.out.print(currentNode.data + " ");
                if(currentNode.left!=null)
                q.add(currentNode.left);
                if(currentNode.right!=null)
                q.add(currentNode.right);
            }
        }
    }

    public static void preorder(Node root){
        if(root==null)
        return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static int countofnodes(Node root){
        if(root==null)return 0;
        int left=countofnodes(root.left);
        int right=countofnodes(root.right);
        return left+right+1;
    }
    public static int sumofnodes(Node root){
        if(root==null)return 0;
        int left = sumofnodes(root.left);
        int right = sumofnodes(root.right);
        return left+right+root.data;
    }
    public static int height(Node root){
        if(root==null)return 0;
        int left = height(root.left);
        int right = height(root.right);

        return left>right?left+1:right+1;
    }

    public static int diameter1(Node root){
        if(root==null) return 0;
        int d1 = diameter1(root.left);
        int d2 = diameter1(root.right);
        int d3 = height(root.left)+height(root.right)+1;

        return Math.max(d2, Math.max(d1, d3));
    }

    static  class  TreeInfo{
        int ht;
        int diameter;
        TreeInfo(int ht,int diameter){
            this.ht = ht;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root==null) return new TreeInfo(0,0);
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        
        int myheight = Math.max(left.ht, right.ht)+1;

        int d1 = left.diameter;
        int d2 = right.diameter;
        int d3 = left.ht+right.ht+1;

        TreeInfo me = new TreeInfo(myheight,Math.max(Math.max(d1, d2), d3));
        return me;

    }

        public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        Node root= tree.bulidNode(nodes);
        System.out.println(diameter2(root).diameter);
    }
}


