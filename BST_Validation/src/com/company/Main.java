package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BST newtree = new BST();

        int[] array = {3,2,1,5,4,6};
        for (int i = 0; i < array.length; i++) {
            newtree.add(array[i]);
        }
        if(newtree.preorder(array))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
