package binarySearch;

public class SearchInfiniteArray {

    public static void main(String[] args) {
        // Example data (pretend it's infinite)
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};

        int key = 130;
        int result = findPos(arr, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }

    static int findPos(int[] arr, int key) {
        int low = 0;
        int high = 1;

        // Expand the range exponentially until we find a value >= key
        while (getValue(arr, high) < key) {
            low = high;
            high = high * 2; // double high index
        }

        // Binary search in the found range
        return binarySearch(arr, low, high, key);
    }

    // Helper function to safely access array index without arr.length
    static int getValue(int[] arr, int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return Integer.MAX_VALUE; // pretend values beyond are infinite
        }
    }

    static int binarySearch(int[] arr, int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int midVal = getValue(arr, mid);

            if (midVal == key) return mid;
            else if (midVal > key) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}

