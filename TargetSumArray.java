import java.util.ArrayList;
import java.util.List;

class TargetSumArray {
    // Corrected method signature and return type
    public static List<List<Integer>> subArray(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum < target) {
                    list.add(arr[j]);
                } else if (sum == target) {
                    list.add(arr[j]);
                    ans.add(new ArrayList<>(list));  // Add a new copy of the list to the answer
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, -7, 1, 3, 3, 1, -4};
        int target = 7;
        System.out.println(subArray(arr, target));
    }
}
