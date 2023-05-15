// Напишите программу, которая проверяет, является ли строка палиндромом.
public class Main {
    public static void main(String[] args) {
        String input = "tenet";
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String input) {

        int length = input.length();

        for (int i = 0; i < length; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}