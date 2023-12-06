package java_algorithm.ch07_array;

import java.util.Arrays;
import javax.xml.stream.events.StartDocument;

public class TwoSum {
    public static int[] solution(int[] nums, int target) {
        for (int i = 0; i  < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 6, 11, 15}, 8)));
    }
}
