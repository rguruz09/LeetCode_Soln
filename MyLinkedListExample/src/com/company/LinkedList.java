package com.company;

/**
 * Created by Raghu on 1/1/2016.
 */
public class LinkedList {
    private Node head;

    // constructor
    public LinkedList(){
        head = null;
    }

    //Add from front
    public void addFromFront(int data){
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        }else{
            newnode.setNext(head);
            head = newnode;
        }
    }

    //Add Rear
    public void addFromRear(int data){
        Node temp;
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else{
            temp = head;
            while (temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    // delete from front
    public void deleteFront(){
        if (head == null) {
            System.out.println("List is Empty.. cannt remove any item");
        }else {
            System.out.println("deleting from front");
            System.out.println("Deleted item is - "+head.getData());
            head = head.getNext();
        }
    }

    //delete from rear
    public void deleteRear(){
        Node cur,prev;
        if (head == null) {
            System.out.println("List is Empty.. cannt remove any item");
        }else if(head.getNext()==null){
            System.out.println("deleting from Rear");
            System.out.println("Deleted item is - "+head.getData());
            head = null;
        }else {
            System.out.println("deleting from Rear");
            cur = prev = head;
            while (cur.getNext()!=null){
                prev = cur;
                cur = cur.getNext();
            }
            System.out.println("Deleted item is - "+cur.getData());
            prev.setNext(null);
        }
    }

    //Display data
    public void displayData(){
        Node temp;
        if (head == null) {
            System.out.println("List is Empty");
        }else {
            temp = head;
            System.out.print("Data is :");
            while (temp.getNext()!=null){
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
            System.out.println(temp.getData());
        }
    }

}
