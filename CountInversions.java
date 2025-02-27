import java.util.Arrays;

public class CountInversions {
     public static int  merge(int arr[],int start,int mid,int end){
        int i=start,j=mid+1,Invcount=0,count=0;
        int temp[] = new int[end-start+1];
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[count++]= arr[i++];
            }else{
                temp[count++]= arr[j++];
                Invcount += (mid-i+1);
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
        return Invcount ;
    }

    public static int  sort(int[] arr,int start,int end){
        if(start<end){
            int mid = start + (end-start)/2;
            int leftCount = sort(arr, start, mid);//left subArray
            int rightCount = sort(arr, mid+1, end); //right subArray
            
            int count = merge(arr,start,mid,end);
            return leftCount + rightCount + count;
        }
        return 0;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,6,5};
        int value = sort(arr,0,arr.length-1);
        System.out.println(value);
    }
}
