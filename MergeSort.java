import java.util.Arrays;

public class MergeSort {

    public static void merge(int arr[],int start,int mid,int end){
        int i=start,j=mid+1,count=0;
        int temp[] = new int[end-start+1];
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[count++]= arr[i++];
            }else{
                temp[count++]= arr[j++];
            }
        }
        while(i<=mid){
            temp[count++]= arr[i++];
        }
        while(j<=end){
            temp[count++]=arr[j++];
        }
        for(i=0;i<temp.length;i++){
            arr[start+i]=temp[i];
        }
    }

    public static void sort(int[] arr,int start,int end){
        if(start<end){
            int mid = start + (end-start)/2;
            sort(arr, start, mid);//left subArray
            sort(arr, mid+1, end); //right subArray
            
            merge(arr,start,mid,end);
        }
    }
    public static void main(String[] args){
        int arr[] = {35,243,342,12,45,2,4};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
