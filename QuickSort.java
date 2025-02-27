import java.util.Arrays;

public class QuickSort {
    public static int partition(int arr[],int st,int end){
        int indx = st-1,j,pivot = arr[end];
        for(j=st;j<end;j++){
            if(arr[j]<=pivot){
                indx++;
                if (indx != j) { 
                    arr[indx] = arr[indx] ^ arr[j];
                    arr[j] = arr[indx] ^ arr[j];
                    arr[indx] = arr[indx] ^ arr[j];
                }
            }
        }
        indx++;
        if (indx != j) { 
            arr[indx] = arr[indx] ^ arr[j];
            arr[j] = arr[indx] ^ arr[j];
            arr[indx] = arr[indx] ^ arr[j];
        }
        return indx;
    }
    public static void sort(int arr[] ,int st,int end){
        if(st<end){
            int pivot = partition(arr,st,end);
            sort(arr, st, pivot-1);
            sort(arr, pivot+1, end);
        }
    }
    public static void main(String args[]){
        int arr[] = {35,243,342,12,45,2,4};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));     
    }
}
