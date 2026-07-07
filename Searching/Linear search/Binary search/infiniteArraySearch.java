public class infiniteArraySearch {
    static int answer(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={2,4,13,16,23,25,45,58,69,71,74,76,98,100};
        int target=100;
        int ans=answer(arr, target);
        System.out.println(ans);
    }
}
