package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count = s.nextInt();

        for (int i = 0; i < str.length() ; i++) {
            for (int j = 0; j <= str.length()-i; j++) {
                if(hmap.containsKey(str.substring(j,i+j))){
                    //System.out.println(str.substring(j,i+j));
                    hmap.put(str.substring(j,i+j), (Integer) hmap.get(str.substring(j,i+j))+1) ;
                }else {
                    hmap.put(str.substring(j,i+j),1);
                }
            }
        }
        System.out.println("Hey");

    }
}
