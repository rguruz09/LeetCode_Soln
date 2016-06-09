package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int numtest = s.nextInt();

        for (int i = 0; i < numtest; i++) {
            boolean flg = true;
            int n = s.nextInt();
            char[][] grid = new char[n ][n];

            for (int j = 0; j < n; j++) {
                grid[j] = s.next().toCharArray();
            }

            for (int j = 0; j < n; j++) {
                grid[j] = bubblesort(grid[j]);
            }

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n-1; k++) {
                    if(grid[k][j] > grid[k+1][j]){
                        flg = false;
                        break;
                    }

                }
            }

            if(flg){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

    public static char[] bubblesort(char[] carr){

        for (int i = 0; i < carr.length; i++) {
            for (int j = 0; j < carr.length; j++) {
                if(carr[i] < carr[j]){
                    char temp = carr[i];
                    carr[i] = carr[j];
                    carr[j] = temp;
                }
            }
        }
        return carr;
    }
}
