package java_algorithm.ch07_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // O(n^2)
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

    // 평균 O(n), 최악의 경우 O(n)
    public static int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i]) && i != numsMap.get(target - nums[i]))
                return new int[]{i, numsMap.get(target - nums[i])};
        }

        return null;
    }

    public static int[] solution3(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                return new int[]{numsMap.get(target - nums[i]), i};
            }
            numsMap.put(nums[i], i);
        }
        return null;
    }
    // 투 포인터는 정렬된 상태에서만 가능
    // -> 인덱스 값을 리턴하는 문제이므로 정렬 시 문제가 발생하므로 '투 포인터'를 사용해 문제를 풀 수 없다.
    public static int[] solution4(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left != right) {
            if (nums[left] + nums[right] < target) {
                left += 1;
            } else if (nums[left] + nums[right] > target) {
                right -= 1;
            } else {
                return new int[]{left, right};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution4(new int[]{2, 6, 11, 15}, 8)));
    }
}
