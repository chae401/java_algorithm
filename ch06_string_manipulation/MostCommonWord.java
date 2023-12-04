package java_algorithm.ch06_string_manipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MostCommonWord {
    public static String solution(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> counts = new HashMap<>();

        // 전처리
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");
        for (String word : words) {
            if (!ban.contains(word)) {
                counts.put(word, counts.getOrDefault(word, 1) + 1);
            }
        }
        return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
    public static void main(String[] args) {
        System.out.println(solution("Ross hit a ball, the hit BALL flew far away after it wat hit"
        , new String[] {"hit"}));
    }
}
