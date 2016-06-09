package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int ct = s.nextInt();
        int[] arr = new int[ct];


        for (int i = 0; i < ct; i++) {
            arr[i] = s.nextInt();                    
        }

        HashMap<Integer, Boolean> hmap = new HashMap<>();

        for (int i = 0; i < ct; i++) {
            if(hmap.containsKey(arr[i])){
                hmap.remove()
            }else{

            }
        }
    }
}
