package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);

        int len = s. nextInt();
        int[] myArr = new int[len];

        for (int i = 0; i < len; i++) {
            myArr[i] = s.nextInt();
        }

        int minranage = s.nextInt();
        int maxrange = s.nextInt();
         // = Integer.MAX_VALUE;
//        int mm;
//        int ans = Integer.MIN_VALUE;
//        int prevmin = Integer.MIN_VALUE;
//        for (int i = minranage; i <= maxrange ; i++) {
//            int min = Integer.MAX_VALUE;
//            mm = Integer.MAX_VALUE;
//            for (int j = 0; j < len; j++) {
//                if(Math.abs(myArr[j] - i) < mm){
//                    min = i;
//                    mm = Math.abs(myArr[j] - i);
//                }
//            }
//            if(prevmin < mm){
//                prevmin = mm;
//                ans = min;
//            }else if(prevmin == mm && ans > min){
//                ans = min;
//            }
//        }


        System.out.print(ans);

    }
}
