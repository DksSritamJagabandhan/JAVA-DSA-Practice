import java.util.ArrayList;
import java.util.List;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr={4,3,6,7,8,1,2,9,0};
        int[] arr2={4,3,3,6,7,1,1,9,5};
        int ans=missing0toN(arr);
        List<Integer> ans2=missing1toN(arr2);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int missing0toN(int[] arr){
        int i=0; 
        while (i<arr.length) {
            int correct=arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[correct]) {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]!=idx){
                return idx;
            }
        }
        return arr.length;
    }
    static List<Integer> missing1toN(int[] arr2){
        int i=0; 
        while (i<arr2.length) {
            int correct=arr2[i]-1;
            if (arr2[i]!=arr2[correct]) {
                swap(arr2,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int idx = 0; idx < arr2.length; idx++) {
            if(arr2[idx]!=idx+1){
                ans.add(idx+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
