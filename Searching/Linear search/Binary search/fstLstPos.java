import java.util.Arrays;

public class fstLstPos {
    static int[] searchRange(int[] arr,int target){
        int[] ans={-1,-1};
        int start=search(arr,target,true);
        int end=search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] arr,int target,boolean findstart){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                ans=mid;
                if(findstart){
                    end=mid-1;
                }else start=mid+1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int[] arr={2,4,6,9,9,9,9,12,14,15};
        int target=9;
        int[] ans=searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

}