import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            if (seenNumbers.contains(num)) {
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution a = new Solution();

        int[] nums = {1, 2, 3, 4, 2}; // example input

        System.out.println(a.containsDuplicate(nums));
    }
}