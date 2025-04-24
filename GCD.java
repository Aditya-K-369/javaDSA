import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int a,b,rem;
        System.out.println("Enter the two numbers to find out the gcd such that a>b : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        while(b>0){        //b>0 then a value is the remainder based on the euclidean algorithm
             rem = a%b;    
             a=b;           // q     a       b     r
             b=rem;         // q     a=b     b=r   a%b  
        }
        System.out.println("gcd is "+a);
        sc.close();
    }
}
