package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        int ct = s.nextInt();
        int num, tmp;
        int[]  arr = new int[ct];

        int isprecent;
        StringBuilder bef = new StringBuilder();
        StringBuilder aft = new StringBuilder();

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < ct; i++) {
            num = s.nextInt();
            arr[i]=num;
            if(hmap.containsKey((Object)num)){
                bef.append("1");
                tmp = hmap.get((Object)num);
                hmap.put(num,tmp+1);
            }else {
                bef.append("0");
                hmap.put(num,1);
            }
        }

        System.out.println(bef.toString());

        for (int i = 0; i < arr.length; i++) {
            if(hmap.get((Object)arr[i]) > 1){
                aft.append("1");
                hmap.put(arr[i],hmap.get((Object)arr[i])-1);
            }else {
                aft.append("0");
            }
        }

        System.out.println(aft.toString());
    }

    public static void triangle(){

        Scanner scan = new Scanner(System.in);
        int a=0,b=0,c=0;
        int tests = scan.nextInt();
        for (int i=0;i<tests;i++){
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();

            if ((a+b>c) && (b+c>a) && (a+c>b)){
                if (a==b && b==c){
                    System.out.println("Equilateral");
                }
                else if ((a==b && b!=c) || (b==c && c!=a) || (a==c && c!=b)) {
                    System.out.println("Isosceles");
                }
                else{
                    System.out.println("None of these");
                }
            }
            else{
                System.out.println("None of these");
            }
        }

    }
}
