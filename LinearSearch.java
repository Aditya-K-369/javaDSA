import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the value to search:");
        int target = in.nextInt();
        boolean found = false;
        for (int i = 0; i < 6; i++) {
            if (arr[i] == target) {
                System.out.println("Element found");
                found = true;
                break;
            }
        }
        if (found) {

        } else {

            System.out.println("Element not found");
        }

    }
}
