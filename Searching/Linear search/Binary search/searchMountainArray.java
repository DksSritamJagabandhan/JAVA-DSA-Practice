public class searchMountainArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7, 9, 6, 2, 1 };
        int target = 6;
        System.out.println(search(arr, target));

    }

    static int search(int[] arr, int target) {
        int peak = findPeak(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return binarySearch(arr, target, peak + 1, arr.length - 1);
        }

    }

}

static int findPeak(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] > arr[mid + 1]) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }
    return start;
}

static int binarySearch(int[] arr, int target, int start, int end) {
    ;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            return mid;
        }
        return -1;
    }
}
