package org.example;

public class bai2_1 {
    public static void main(String[] args) {
        int n = 123432;
        if (kiemtra(n)){
            System.out.println( "  doi xung:");
        }else {
            System.out.println("khong doi xung");
        }

    }
    public static boolean kiemtra(int n){
        String s = Integer.toString(n);
        int l = s.length()-1;
        for (int i =0; i<s.length()/2;i++){
            if (s.charAt(i) != s.charAt(l)){
                return false;
            }
        }
        return true;
    }
}








