public class TrieProblem2 {

    static class Node {
        Node[] children;
        boolean eow;

        Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int indx = word.charAt(i) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            if (word.length() - 1 == i) {
                curr.eow = true;
            }
            curr = curr.children[indx];

        }
    }
    static String ans="";
    static void longestWord(Node root ,StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.eow!=false){
                temp.append((char)(i+'a'));
                if(ans.length() <temp.length()){
                    ans=temp.toString();
                }
                longestWord(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String args[]) {
            String words[] = {"a","ap","apply","app","apple","appl","bunty"};
            for(String e:words){
                insert(e);
            }
            longestWord(root,new StringBuilder());
            System.out.println(ans);

    }
}
