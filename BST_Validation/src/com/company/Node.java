package com.company;

/**
 * Created by Raghu on 1/12/2016.
 */

public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data){
        this.data = data;
        right = null;
        left = null;
    }
    
    public int getData(){
        return this.data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getLeft(){
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public void setRight(Node right){
        this.right = right;
    }
}
