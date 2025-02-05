import java.util.Scanner;

public class BinarySearch {
    static int low =0,high = 5,mid =(low+high)/2;
    public static boolean Search(int arr[], int target) {
        if(low>high){
            return false;
        }
        if (arr[mid]==target){
            return true;
        }else if(arr[mid]>target){
            high = mid-1;
            mid =(low+high)/2;
            return Search(arr,target);
        }
        else{
            low = mid+1;
            mid =(low+high)/2;
            return Search(arr,target);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the value to search:");
        int target = in.nextInt();
        boolean found = Search(arr, target);
        if (found) {
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not found");
        }
    }
}