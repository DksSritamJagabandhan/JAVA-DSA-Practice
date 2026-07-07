import java.util.Scanner;
public class linearSearch {
    public static void main(String args[]){
        int[] arr={12,14,17,5,3,10};
        int target=3;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
