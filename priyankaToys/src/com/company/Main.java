package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        if(n == 1){
            System.out.print("1");
        }else {

            Arrays.sort(arr);
            int i =0;

            while (i<n){

                int base = arr[i];
                boolean f = true;

                while (i<n && arr[i] <= base+4){
                    i++;
                    f = false;
                }

                if(f)
                    i++;
                count++;


            }

        }

        System.out.print(count);



    }
}
