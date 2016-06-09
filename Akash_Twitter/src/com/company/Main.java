package com.company;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner s = new Scanner(System.in);
        int ct = s.nextInt();
        String[] str = new String[ct];
        boolean valid = true;

        String[] res = new String[ct];

        for (int i = 0; i < ct; i++) {
            str[i] = s.nextLine();
        }

        for (int i = 0; i < str.length; i++) {

            Stack<Character> cstack = new Stack<Character>();
            valid = true;
            char[] caar = str[i].toCharArray();

            for (int j = 0; j < caar.length; j++) {

                switch (caar[j]){

                    case '{' :
                        cstack.push(caar[j]);
                        break;
                    case '(' :
                        cstack.push(caar[j]);
                        break;
                    case '[' :
                        cstack.push(caar[j]);
                        break;
                    case ']' :
                        if ( cstack.size() > 0 &&  cstack.peek() == '[' ) {
                            cstack.pop();
                        }else {
                            valid = false;
                        }
                        break;
                    case '}' :
                        if ( cstack.size() > 0 && cstack.peek() == '{' ) {
                            cstack.pop();
                        }else {
                            valid = false;
                        }
                        break;
                    case ')' :
                        if ( cstack.size() > 0 && cstack.peek() == '(' ) {
                            cstack.pop();
                        }else {
                            valid = false;
                        }
                        break;
                    default:
                        valid = false;
                        break;

                }

                if(!valid)
                    break;

            }
            if(!valid || cstack.size() != 0  )
                res[i] = "NO";
            else
                res[i] = "YES";

        }






    }


    public static void tree(){
        Scanner s = new Scanner(System.in);
        int ct = s.nextInt();
        int numCycles;
        int height = 1;
        for (int i = 0; i < ct; i++) {
            numCycles = s.nextInt();
            height = 1;
            for (int j = 1; j <= numCycles; j++) {
                if(j%2==1){
                    height *= 2;
                }else {
                    height++;
                }
            }
            System.out.println(height);
        }
    }
}
