package org.example;

import java.util.Arrays;

public class bai4_1 {
    public static void main(String[] args) {
        int A[]={100,2130,123,3,54,6,1,2111,1,1,1,1,1,1,45,465,46,1234,54353};
        // sap xep theo thu tu so chan  tang dan
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 2;
            while (j >= 0 && A[j] % 2 == 0 && A[j] > key) {
                A[j + 1] = A[j];

                j--;
            }
            A[j + 1] = key;
        }

        System.out.println(Arrays.toString(A));


    }



}
