package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        List<String> ls = summaryRanges(arr);
        System.out.println("H");
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();

        if(nums.length == 1){
            ls.add(nums[1]+"");
        }else {
            for (int i = 1; i < nums.length; ) {
                int j = i;
                boolean flag = true;
                while (j < nums.length && nums[j]-nums[j-1] == 1  ){
                    j++;
                    flag = false;
                }
                if(!flag){
                    ls.add(nums[i-1] +"->"+ nums[j-1]);
                }else {
                    ls.add(nums[i-1]+"");
                }
                i = j+1;
                if(i == nums.length){
                    ls.add(""+nums[i-1]);
                }
            }
        }
        return ls;
    }
}
