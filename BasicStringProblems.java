/******************************************************************************
 * covering fundamental data structures, collections, arrays, strings, stacks,
 * queues, and basic problem-solving techniques
 *******************************************************************************/
public class BasicStringProblems {
    // Printing all elements of an array
    static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Find Maximum Element
    static void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum: " + max);

    }

    // 2D Array Traversal
    static void TwoDArrayTraversal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
        }
    }

    // String Manipulation (Without Built-in Functions)

    static void ReverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed: " + rev);
    }

    // Check Palindrome

    static void CheckPalindrome(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }

    public static void main(String[] args) {
        int[] arr = { 29, 12, -3, 45, 13, 90, 112, 23 };
        String st = "MADAM";
        int[][] mat = { { 1, 2 }, { 16, 4, 7 }, { 8, 4, 3, 67 } };

        printArray(arr);
        findMax(arr);
        TwoDArrayTraversal(mat);
        ReverseString(st);
        CheckPalindrome(st);

    }
}
