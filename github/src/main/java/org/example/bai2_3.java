package org.example;

import java.util.Stack;

public class bai2_3 {
    public static void main(String[] args) {
        int n = 123432;
        String binaryNumber = DecimalToBinary(n);
        System.out.println( "so thap phan cua  la:" + binaryNumber);

    }

    public static String DecimalToBinary(int n) {
        Stack<Integer> stack = new Stack<>();

        while (n > 0) {
            int remainder = n % 2;
            stack.push(remainder);
            n /= 2;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();

    }

}
