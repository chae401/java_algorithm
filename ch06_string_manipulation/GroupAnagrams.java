package java_algorithm.ch06_string_manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static List<List<String>> solution(String[] strings) {
        Map<String, List<String >> results = new HashMap<>();
        for (String s : strings) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            if (!results.containsKey(key))
                results.put(key, new ArrayList<>());
            results.get(key).add(s);
        }
        return new ArrayList<>(results.values());
    }
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"eat", "tea", "tan", "ant", "cat"}));
    }
}
