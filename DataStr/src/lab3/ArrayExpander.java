/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Root
 */
public class ArrayExpander {

    private int size;
    private int noOfItems;
    private String[] store;
    private final int INITIALSIZE = 2;

    public ArrayExpander() {
        store = new String[INITIALSIZE];
        noOfItems = 0;
        size = INITIALSIZE;
    }

    public void add(String x) {
        if (!EnsureCapcity()) {
            size = size * 2;
            String[] temp = new String[size];
            for (int i = 0; i < store.length; i++) {
                temp[i] = store[i];
            }
            store = temp;
        }
        store[noOfItems] = x;             // insert it
        noOfItems++;
    }

    public String toString() {
        String temp = "[" + store[0];
        for (int i = 1; i < noOfItems; i++) {
            temp = temp + "," + store[i];
        }
        temp = temp + "]";
        return temp;
    }

    public boolean EnsureCapcity() // To Know if capcity  size avalibe or not 
    {
        return noOfItems + 1 <= size;
    }

    public int getSize() {
        return size;
    }
}
