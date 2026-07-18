public class arraySortedOrNot {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,9};
        System.out.println(check(arr,0));
    }
    static boolean check(int[] arr,int idx){
        if (idx == arr.length-1){
            return true;
        }
        if (arr[idx+1]<arr[idx]){
            return false;
        }
        return check(arr,idx+1);
    }
}
