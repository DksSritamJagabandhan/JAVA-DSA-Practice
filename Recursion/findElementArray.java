import java.util.ArrayList;

public class findElementArray {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,9,9,11,13};
        ArrayList<Integer> ans=findIndex(arr, 9, 0, new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> findIndex(int[] arr,int target,int idx,ArrayList<Integer> list){
        if(idx==arr.length){
            return list;
        }
        if (arr[idx]==target){
            list.add(idx);
        }
        return findIndex(arr, target, idx+1, list);
    }
}
