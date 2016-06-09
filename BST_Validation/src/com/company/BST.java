package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Raghu on 1/12/2016.
 */
public class BST {

    private ArrayList<Integer> preord;
    Node root;

    public BST(){
        root = null;
    }

    public boolean add(int data){
        Node newNode = new Node(data);
        Node cur,  prev;
        if(root == null){
            root = newNode;
            System.out.println("This is the root");
            return true;
        }else{
            cur = root;
            while (cur!=null){
                prev = cur;
                if(data<cur.getData()){
                    cur = cur.getLeft();
                    if(cur == null){
                        prev.setLeft(newNode);
                        System.out.println("Node is added at the left");
                    }
                }else{
                    cur = cur.getRight();
                    if(cur == null){
                        prev.setRight(newNode);
                        System.out.println("Node is added at the Right");
                    }
                }
            }
            return true;
        }
    }

    public boolean preorder(int[] array ){
        preord = new ArrayList<>(array.length);
        preorder(root);

        for (int i = 0; i < preord.size(); i++) {
            if (array[i] == preord.get(i)) {
                continue;
            }else
                return false;
        }
        return true;
        //return false;
    }

    public void preorder(Node root)
    {
        if(root == null)
            return;

        preord.add(root.getData());
        System.out.println(root.getData());
        preorder(root.getLeft());
        preorder(root.getRight());
    }
}
