package binarySearch;

public class Leetcode_33 {
    public static int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) return mid;
            if (mid > start && nums[mid] < nums[mid - 1]) return mid - 1;
            if (nums[mid] >= nums[start]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 1) return nums[0] == target ? 0 : -1;
        int pivot = findPivot(nums);
        if (pivot == -1) return binarySearch(nums, 0, nums.length - 1, target);
        if (nums[pivot] == target) return pivot;
        if (target >= nums[0]) return binarySearch(nums, 0, pivot - 1, target);
        return binarySearch(nums, pivot + 1, nums.length - 1, target);
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
