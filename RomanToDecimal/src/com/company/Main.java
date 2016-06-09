package com.company;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println(convert("LXIV"));

    }

    public static int getDecimal(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static int convert(String roman) {
        char[] n = roman.toCharArray();
        int total = 0;
        char previous = n[n.length-1];
        for (int i = n.length-1; i>=0; i--) {
            int p = getDecimal(previous);
            int c = getDecimal(n[i]);
            if (p > c) total-=c;
            else {
                total+=c;
                previous = n[i];
            }
        }
        return total;
    }
}
