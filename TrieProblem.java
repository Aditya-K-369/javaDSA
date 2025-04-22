public class TrieProblem {
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
    static boolean search(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int indx = word.charAt(i)-'a';
            if(curr.children[indx]==null){
                return false;
            }
            if((word.length()-1==i) && (curr.eow==false)){
                return false;
            }
            curr = curr.children[indx];
        }
        return true;
    }

    static  boolean wordBreak(String word){
        if(word.length()==0){
            return true;
        }
        for(int i=1;i<=word.length();i++){
            String str1 = word.substring(0, i);
            String str2 = word.substring(i,word.length());
            if(search(str1) && wordBreak(str2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String words[] = {"i","like","sam","samsung","code"};
        for(String word:words){
            insert(word);
        }
        System.out.println(wordBreak("ilikesamsung"));
    }
}
