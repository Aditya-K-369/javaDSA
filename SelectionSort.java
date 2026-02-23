import java.util.Scanner;

public class SelectionSort {

    static void Sl(int arr[]) {
        int si = 0;
        for (int i = 0; i < 5; i++) {
            si = i;
            for (int j = i + 1; j < 6; j++) {
                if (arr[j] < arr[si]) {
                    si = j;
                }
            }
            arr[si] = (arr[si] + arr[i]) - (arr[i] = arr[si]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }
        Sl(arr);
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + "-> ");
        }
        in.close();
    }

}
