import java.util.Scanner;

public class BubbleSort{

    static void Bl(int arr[]){
        for(int i =0;i<5;i++){//no of passes
            for(int j=0;j<5-i;j++){//compares the beside values leaves the last values based on passes
                if(arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }
        Bl(arr);
        for(int i=0;i<6;i++){
            System.out.print(arr[i]+"-> ");
        }
    }
}