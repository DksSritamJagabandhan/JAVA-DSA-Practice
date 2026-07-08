import java.util.Arrays;
public class bubble {
    public static void main(String[] args) {
        int[] arr={1,5,3,9,6,3,2,0,10};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        boolean swapped;
        int l=arr.length;
        for (int i = 0; i < l; i++) {
            swapped=false;
            for (int j = 0; j < l-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;

                }
            }  
            if (!swapped) {
            break;
        }
        }
        
    }
}
