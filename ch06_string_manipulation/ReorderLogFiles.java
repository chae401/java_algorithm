package java_algorithm.ch06_string_manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReorderLogFiles {
    public static String[] solution(String[] input) {
        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();

        for (String log : input) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
                digitList.add(log);
            } else {
                letterList.add(log);
            }
        }
        letterList.sort((s1, s2) -> {
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);
            int compared = s1x[1].compareTo(s2x[1]);
            if (compared == 0) {
                return s1x[0].compareTo(s2x[0]);
            } else {
                return compared;
            }
        });
        letterList.addAll(digitList);

        return letterList.toArray(new String[0]);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"id1 8 1 5 1", "id2 art can", "id3 3 6"
                , "id4 own kit kig", "id5 art zero"})));
    }
}
