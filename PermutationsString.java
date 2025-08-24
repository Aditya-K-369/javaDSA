public class PermutationsString {
    public static void permutation(String str,int indx){

        if(indx==str.length()){
            System.out.println(str);
        }
        for(int i=indx;i<str.length();i++){          
            StringBuilder sb = new StringBuilder(str); 
            char char1 = sb.charAt(indx);             
            char char2 = sb.charAt(i);             
            sb.setCharAt(indx, char2);              
            sb.setCharAt(i, char1); 
            permutation(sb.toString(), indx+1);
            sb.setCharAt(i, char2);              
            sb.setCharAt(indx, char1);
            str  = new String(sb);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str,0);
    }
}
