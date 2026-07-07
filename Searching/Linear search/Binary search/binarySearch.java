import java.util.Arrays;

public class binarySearch {
    static void sorting(int[] arr){
        int l=arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    static boolean search(int[] arr,int target){
        int start=0;
        int end=arr.length;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr={23,45,62,1,2,5,91,20};
        int target=20;
        sorting(arr);
        System.out.println(Arrays.toString(arr));
        boolean ans=search(arr,target);
        System.out.println(ans);


    }
}
