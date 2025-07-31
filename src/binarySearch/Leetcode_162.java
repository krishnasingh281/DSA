package binarySearch;

public class Leetcode_162 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 6, 3, 1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start<end){
            int mid = start + (end-start) / 2;
            if(arr[mid]> arr[mid+1]){
                end =mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

}
