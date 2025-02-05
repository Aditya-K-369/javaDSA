import java.util.Scanner;

public class BinarySearchWithoutRecursion {
    public static boolean Search(int[] arr, int target) {
        int low = 0, high = arr.length - 1, mid = (low + high) / 2;
        while (low < high) {
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return false;
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
        if(found){
            System.out.println("Element is found");
        }else{
            System.out.println( "Element is not found");
        }
    }
}
