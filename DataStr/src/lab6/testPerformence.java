/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Root
 */
public class testPerformence {

    public static void main(String[] args) {
        Tree t = new Tree();
        for (int i = 0; i < 20_000; i++) {
            t.insert(i);
        }
        double s = System.currentTimeMillis();
        t.find(10000);
        double e = System.currentTimeMillis();
        System.out.println("Time take is " + (e - s));
        System.out.println("--------------------");
        double m= System.currentTimeMillis();
        t.findRec(10000, t.getRoot());
        double h= System.currentTimeMillis();
        System.out.println("Time take is " + (h -m));
     // find with out recsice is slower 
    }

}
