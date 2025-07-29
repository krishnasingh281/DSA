package binarySearch;

public class binarySearch {

    static int BinarySearch(int[] arr, int target, int start, int end) {
            if (end < start) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (target > arr[mid]) {
            return BinarySearch(arr, target, mid + 1, end);
        } else if (target < arr[mid]) {
            return BinarySearch(arr, target, start, mid - 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 10, 14, 17, 18};
        int target = 17;
        int start = 0;
        int end = arr.length - 1;

        System.out.println(BinarySearch(arr, target, start, end));  // Output should be 6
    }
}
