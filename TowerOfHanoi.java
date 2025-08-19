public class TowerOfHanoi {

    public static void TowerOfHanoi1(int n, char src,char dest,char helper){
        if(n==0){
            return ;
        }
        TowerOfHanoi1(n-1, src, helper, dest);
        System.out.println("Move from "+src + " To " + dest);
        TowerOfHanoi1(n-1, helper, dest, src);
    }
    public static void main(String[] args) {
        TowerOfHanoi1(3,'A','B','C');
    }
}
