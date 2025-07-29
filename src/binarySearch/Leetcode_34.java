package binarySearch;

import java.util.Arrays;

public class Leetcode_34 {
    static int findFirst(int[] arr, int target){
        int mid;
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        while (start <= end) {
            mid = (start+end)/2;
            if(arr[mid] == target){
                first = mid;
                end = mid-1;
            } else if (arr[mid]>target) {
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return first;
    }

    static int findLast(int[] arr, int target){
        int mid;
        int start = 0;
        int end = arr.length - 1;
        int last = -1;
        while (start <= end) {
            mid = (start+end)/2;
            if(arr[mid] == target){
                last = mid;
                start = mid + 1;
            } else if (arr[mid]>target) {
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] res = {-1,-1};
        res[0] = findFirst(arr, target);
        res[1] = findLast(arr, target);
        System.out.println(Arrays.toString(res));

    }
}
