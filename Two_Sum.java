import java.util.*;

class TwoSum {

    private Map<Integer, Integer> map;

    public TwoSum() {
        map = new HashMap<>();
    }

    // Add number
    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    // Find pair with given sum
    public boolean find(int target) {

        for (int num : map.keySet()) {
            int complement = target - num;

            if (complement != num && map.containsKey(complement)) {
                return true;
            }

            if (complement == num && map.get(num) > 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TwoSum obj = new TwoSum();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            obj.add(num);
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        if (obj.find(target)) {
            System.out.println("Pair exists!");
        } else {
            System.out.println("No pair found.");
        }

        sc.close();
    }
}