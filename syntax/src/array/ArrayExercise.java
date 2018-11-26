package array;
import java.util.Arrays;

public class ArrayExercise {

    public ArrayExercise() {}

    public void arrayExerciseMethod() {
        int[] nums = {61, 23, 4, 74, 13, 148, 20};
        int max = nums[0];
        int min = nums[0];
        double sum = 0;
        double avg;

        // 求最大值、最小值、平均值
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
            sum += nums[i];
        }

        avg = sum / nums.length;
        System.out.println("数组中的最大值：" + max);
        System.out.println("数组中的最小值：" + min);
        System.out.println("数组中的平均值：" + avg);

        // 排序
        Arrays.sort(nums);
        for (int i : nums) {
            System.out.println(i);
        }

        // 数组转换为字符串
        System.out.println(Arrays.toString(nums));
    }
}