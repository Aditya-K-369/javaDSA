import java.util.ArrayList;

public class BinarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            this.data = val;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    static boolean search(Node root, int key) {
        
        if (root == null) {
            return false;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else if (root.data<key){
            return search(root.right, key);
        }
        else{
            return true;
        }

    }
    public static Node delete(Node root,int val){
        if (root == null) {
            return null;
        }
        if(root.data>val){
            root.left = delete(root.left, val);
        }else if(root.data<val){
            root.right = delete(root.right, val);
        }
        else{
            if(root.right==null && root.left == null){
                return null;
            }
            if(root.right == null){
                return root.left;
            }else if (root.left==null){
                return root.right;
            }

            Node Is = inSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);            
        }
        return root;
    }
    public static Node inSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void q1(Node root,int x,int y){
        if(root== null){
            return ;
        }
        q1(root.left,x,y);
        if(root.data<=y && root.data>=x){
            System.out.println(root.data+" ");
        }
        q1(root.right,x,y);

    }
    public static void q2(ArrayList<Integer> path , Node root){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right == null){
            printPath(path);
        }else{
            q2(path,root.left);
            q2(path,root.right);
        }
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i =0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,4,1,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        q2(new ArrayList<>(), root);
    }
}
