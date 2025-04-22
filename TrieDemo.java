public class TrieDemo {
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

    public static void main(String args[]) {
        System.out.println("hi");
        String words[] = {"a","any","there","the","their"};
        for(String word:words){
            insert(word);
        }
        System.out.println(search("their"));//true
        System.out.println(search("thor"));//false
        System.out.println(search("an"));//false
    }
}
