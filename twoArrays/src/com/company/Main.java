package com.company;

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count;
        int N, K;
        Scanner s = new Scanner(System.in);
        count = s.nextInt();
        int[] A;
        int[] B;

        boolean flag = true;

        for (int i = 0; i < count; i++) {

            N = s.nextInt();
            K = s.nextInt();
            A = new int[N];
            B = new int[N];

            for (int j = 0; j < N; j++) {
                A[j] = s.nextInt();
            }

            for (int j = 0; j < N; j++) {
                B[j] = s.nextInt();
            }

            Arrays.sort(A);
            Arrays.sort(B);
            flag = true;
            for (int j = 0; j < N; j++) {
                if(A[j]+B[N-j-1] < K){
                    flag = false;
                }
            }
            if(flag){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
