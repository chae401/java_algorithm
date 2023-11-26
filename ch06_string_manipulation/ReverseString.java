package java_algorithm.ch06_string_manipulation;

import java.io.IOException;

public class ReverseString {
    public static char[] solution(char[] input) {
        int start = 0;
        int end = input.length - 1;
        while (start < end) {
            char tmp = input[start];
            input[start] = input[end];
            input[end] = tmp;
            start++;
            end--;
        }
        return input;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(solution(new char[] {'r', 'e', 'k', 'o', 'p'}));
    }
}
