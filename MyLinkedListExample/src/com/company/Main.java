package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here





        boolean funny = true;
        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        String  str;
        int n;
        String str1[] = new String[count+1];

        for(int j = 0; j<= count; j++){
            str1[j] = s.nextLine();
        }

        HashMap<Character, String> hmap = new HashMap<Character, String>();

        

        for (int k = 1; k < count; k++) {
            funny = false;
            str =  str1[k].toLowerCase();
            n = str.length();
            for (int i = 0; i < n-1; i++) {
                if ( Math.abs(str.charAt(i) - str.charAt(i+1)) != Math.abs(str.charAt(n-1-i) - str.charAt(n-2-i)) ) {
                    funny = false;
                }
            }
            if(funny){
                System.out.println("Funny");
            }else{
                System.out.println("Not Funny");
            }
        }

//        int count = 0;
//        int val;
//        boolean arr[] = new boolean[26];
//
//        Scanner s = new Scanner(System.in);
//        String str1 = s.nextLine();
//    //    str1.replaceAll("\\s+","");
//        String str =  str1.toLowerCase();
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if(!Character.isLetter(str.charAt(i)))
//                continue;
//
//            if(count >=26){
//                break;
//            }else{
//                val = str.charAt(i)-97;
//                if(arr[val] == true){
//                    continue;
//                }else{
//                    arr[val] = true;
//                    count++;
//                }
//            }
//        }
//
//        if(count < 26)
//            System.out.println("not pangram");
//        else
//            System.out.println("pangram");



//
//        LinkedList linkList = new LinkedList();
//        System.out.println("Adding 10 from front");
//        linkList.addFromFront(10);
//        linkList.displayData();
//        System.out.println("Adding 20 from front");
//        linkList.addFromFront(20);
//        linkList.displayData();
//        System.out.println("Adding 30 from front");
//        linkList.addFromFront(30);
//        linkList.displayData();
//        System.out.println("Adding 40 from Rear");
//        linkList.addFromRear(40);
//        linkList.displayData();
//        System.out.println("Adding 50 from Rear");
//        linkList.addFromRear(50);
//        linkList.displayData();
//        System.out.println("Adding 60 from Rear");
//        linkList.addFromRear(60);
//        linkList.displayData();
//        System.out.println("Adding 10 from Rear");
//        linkList.addFromRear(70);
//        linkList.displayData();
//        linkList.deleteFront();
//        linkList.displayData();
//        linkList.deleteRear();
//        linkList.displayData();
    }
}
