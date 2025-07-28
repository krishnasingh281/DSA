public class Leetcode_744 {
    static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Wrap around if needed
        return arr[start % arr.length];
    }

    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'j';
        char result = nextGreatestLetter(arr, target);

        System.out.println("Next greatest letter after '" + target + "' is: " + result);
    }
}
