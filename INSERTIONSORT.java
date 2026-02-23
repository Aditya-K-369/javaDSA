import java.util.*;

public class INSERTIONSORT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int curr = 0, prev = 0;
        for (int i = 1; i < n; i++) {
            curr = arr[i];
            prev = i - 1;
            for (; prev >= 0 && arr[prev] > curr; prev--) {
                arr[prev + 1] = arr[prev];
            }
            arr[prev + 1] = curr;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
