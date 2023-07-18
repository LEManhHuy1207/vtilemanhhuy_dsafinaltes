package org.example;

public class bai1 {
    public static void main(String[] args) {
        String s = "Abcs12321421@$$%#@#@#%#$$$#@#@";
        String tmep = "";
        for (int i = 0; i < s.length(); i++) {
            if (isNumber(s.charAt(i))) {
                char x = s.charAt(i);
                tmep += x + "";
            }
        }
        System.out.println(tmep);

    }

    static boolean isNumber(char c) {
        if (Character.isDigit(c) || Character.isLetter(c)){
            return true;
        }
        return false;
    }
}

