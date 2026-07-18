import java.util.Arrays;
public class mergeSort {
    public static void main(String[] args) {
        int[] arr={3,7,1,9,5,0,4};
        sortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void sortInplace(int[] arr,int s,int e){
        if (e-s==1) {
            return;
        }
        int m=(s+e)/2;
        sortInplace(arr, s, m);
        sortInplace(arr, m, e);
        mergeInplace(arr,s,m,e);
    }
    static void mergeInplace(int[] arr,int s,int m,int e){
        int[] mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while (i<m && j<e) {
            if (arr[i]<arr[j]) {
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<m) {
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e) {
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }   
    }
    static int[] sort(int[] arr){
        if (arr.length==1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left=sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] left,int[] right){
        int[] mix=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<left.length && j<right.length) {
            if (left[i]<right[j]) {
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<left.length) {
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length) {
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
