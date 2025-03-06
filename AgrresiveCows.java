import java.util.Arrays;
public class AgrresiveCows {

    public static void AgressiveDistance(int arr[],int cows){//defination of main function
        int st = 1,end = 9-1,ans=-1;//intialise the st and end for binary search approach
        while(st<=end){//condition
            int mid = st + (end-st)/2;
            if(isPossible(arr,cows,mid)){//ispossible will return true if the distance is possible and all cows are placed in stalls
                ans = mid;//if it returns true then we will update the ans and move towards the right half array
                st = mid+1;
            }else{//move towards left
                end = mid-1;
            }
        }
        System.out.println(ans);
    }

     static boolean isPossible(int arr[],int cows,int mid){//helper function
        Arrays.sort(arr);//sorting the array for finding the distance between cows
        int cow = 1,lastStall = arr[0];//intialsing
        for(int i = 1;i<arr.length;i++){//loop for range
            if((arr[i]-lastStall)>=mid){//check if distance between the cows is greater than mid if so update cow and stall position
                cow++;
                lastStall = arr[i];
            }
        }
        if(cow==cows){//if the no of cows and the cow count is equal return true
            return true;
        }
        return false;

    }

    public static void main(String args[]){
        int arr[] = {1,2,8,4,9}; //defining a array 
        int cows = 3;//no of cows
        AgressiveDistance(arr,cows);//main function that prints the min distance of max possible value for cows
    }
}
