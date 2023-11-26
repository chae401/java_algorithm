package java_algorithm.ch06_string_manipulation;

import java.io.IOException;

public class ValidPalindrome {
    public static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start <= end) {
            if (!Character.isLetterOrDigit(input.charAt(start))){
                start++;
            }
            else if (!Character.isLetterOrDigit(input.charAt(end))) {
                end--;
            }
            else{
                if(Character.toLowerCase(input.charAt(start)) != Character.toLowerCase(input.charAt(end))) {
                    return false;
                }
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(isPalindrome("HELOol!eh"));
    }
}