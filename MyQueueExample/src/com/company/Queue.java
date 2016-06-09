package com.company;

/**
 * Created by Raghu on 1/4/2016.
 */
public class Queue<T> {

    private static int MAX_LENGTH = 100;
    private int front, rear;
    private Class<T>[] que;

    public Queue(Class<T> tcls){
        que = new tcls[MAX_LENGTH];
    }
}
