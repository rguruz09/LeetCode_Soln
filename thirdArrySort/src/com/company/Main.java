package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] bac = new int[n];



        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            bac[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            bac[i] += arr[i];
        }

        

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j = 0; j < n; j++) {
                if(bac[j] < min){
                    min = bac[j];
                    index = j;
                }
            }
            System.out.print(index+1 + " ");
            bac[index] = Integer.MAX_VALUE;
        }

    }
}
