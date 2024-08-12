import java.util.HashMap;
import java.util.Map;

class towSum {
    public int[] Sum(int[] nums, int target) {
        Map<Integer, Integer> data = new HashMap<>();
        for (int i = 0; ; i++) {
            int x = nums[i];
            int y = target - x;
            if (data.containsKey(y)) {
                return new int[]{i, data.get(y)};
            }
            //num值作为map key  index 作为map value
            data.put(x, i);
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,8,2,6,10};
        int target=10;
        int[] sum = new towSum().Sum(nums, target);
        System.out.println(sum[0]);
        System.out.print(sum[1]);

    }
}
