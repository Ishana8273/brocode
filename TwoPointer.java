
public class TwoPointer {
    /*
     * Use Two Pointer when:
     *
     * Array is sorted
     *
     * Finding pairs
     *
     * Removing duplicates
     *
     * Reversing array/string
     *
     * Partitioning problems
     */
    // Pair with Given Sum (Sorted Array)
    public static void pairSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair Sum exist");
                return;
            } else if (sum < target)
                left++;
            else
                right--;
        }
        System.out.println("Pair Sum not exist");
        return;
    }

    // Reverse Array
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    // 2. Same Direction Two Pointer
    /*
     * Used in:
     *
     * Remove duplicates
     *
     * Move zeros to end
     *
     * Partition problems
     */

    public static void moveZeros(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main() {
        int[] arr = { 0, 1, 0, 3, 12, 2, 1 };
        int sum = 4;
        pairSum(arr, sum);
        reverse(arr);
        moveZeros(arr);
    }
}
