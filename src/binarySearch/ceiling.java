package binarySearch;

public class ceiling {
    static int Ceiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1; // No ceiling exists
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start; // 'start' points to the ceiling index
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 10, 14, 17, 18};
        int target = 15;
        int index = Ceiling(arr, target);

        if (index != -1) {
            System.out.println("Ceiling is " + arr[index] + " at index " + index);
        } else {
            System.out.println("No ceiling exists for the target.");
        }
    }
}
