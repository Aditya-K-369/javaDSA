public class SubStrings {
    public static void subseq(String s,String ans){
        if(s.length() ==0){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        String ros = s.substring(1);
        subseq(ros, ans);
        subseq(ros, ans+ch);
    }
    public static void main(String[] args) {
        subseq("ABC","");
    }
}
