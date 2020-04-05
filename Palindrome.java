package BaiTapStack.Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String inputString = scanner.nextLine();
        if (isPalindrome(inputString)) {
            System.out.println("'" + inputString + "' is a palindrome");
        } else {
            System.out.println(inputString + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String string) {
        Queue<String> queueListString = new LinkedList();
        Stack<String> stackListString = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            queueListString.add(string.substring(i, i + 1));
            stackListString.push(string.substring(i, i + 1));
        }
        int size = stackListString.size();
        for (int i = 0; i < size; i++) {
            if (!stackListString.pop().equals(queueListString.remove())) {
                return false;
            }
        }
        return true;
    }
}