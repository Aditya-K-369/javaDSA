public class MoveallX {
    public static String movex(String s){
        if(s.length()==0){
            return "";
        }
        char first = s.charAt(0);
        String res = movex(s.substring(1));
        if(first == 'x'){
            return res + first;
        }
        return first+res;
    }
    public static void main(String[] args) {
       System.out.println( movex("axxbcdefxxgfx"));
    }
}
