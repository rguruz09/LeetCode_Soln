package com.company;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner s = new Scanner(System.in);
        int numTest = s.nextInt();
        graph[] G = new graph[numTest];
        int[] sources = new int[numTest];
        int i = 0;
        int e, v;

        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

        while (i < numTest) {

            v = s.nextInt();
            e = s.nextInt();
            G[i].setVertices(v);
            G[i].setEdges(e);



            for (int j = 1; j <= e ; j++) {
                int src = s.nextInt();
                int des = s.nextInt();

            }
            sources[i] = s.nextInt();
            G[i].setAdj(al);
            i++;
        }
    }

    public class graph {
        private int source;
        private int edges;
        private int vertices;
        private ArrayList<Integer>[] adj;

        public graph(int e, int v) {
            edges = e;
            vertices = v;
            for (int i = 0; i < edges; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        public void setSource(int s) {
            source = s;
        }

        public int getSource() {
            return source;
        }

        public int getEdges() {
            return edges;
        }

        public void setEdges(int e) {
            edges = e;
        }

        public void setVertices(int v) {
            vertices = v;
        }

        public int getVertices() {
            return vertices;
        }

        public ArrayList<Integer>[] getAdj() {
            return adj;
        }

        public void setAdj(ArrayList<Integer>[] a) {
            adj = a;
        }
    }

}
