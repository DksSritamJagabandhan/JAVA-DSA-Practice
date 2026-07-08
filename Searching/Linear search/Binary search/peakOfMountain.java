public class peakOfMountain {
    static int search(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
    public static void main(String[] args){
        int[] arr={1,3,4,5,8,9,5,3,2,1};
        int ans=search(arr);
        System.out.println("Peak element of mountain array:" +ans);
    }
}
