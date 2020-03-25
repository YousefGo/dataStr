/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

public class testStack {

    public static void main(String[] args) {

        System.out.println("Stack v1");
        StackArrayV1 s1 = new StackArrayV1(100)
                ;
           s1.push(10);
           s1.push(21);
           s1.pop();
          s1.dispaly();
      //  h1 = System.nanoTime();
 //       System.out.println(s1.pop());
   /*     for (int i = 0; i < 10000; i++) {
            s1.push((long) (Math.random() * 100001));
        }
        h2 = System.nanoTime();
        long h= h2-h1;
        System.out.println(h/1000);
        long x1 = System.nanoTime();
        System.out.println("Stack V2");
        StackArrayV2 s2 = new StackArrayV2(10000);
        for (int i = 0; i < 10000; i++) {
            s2.push((long) (Math.random() * 100001));

        }*/
    /*    long x2 = System.nanoTime();
        long x = x2-x1;
   //     System.out.println(x2-x1);
        System.out.println(x/1000);
        if (x < h) {
            System.out.println("Stack 2 faster ");
        } else {
            System.out.println("Stack 1 faster ");
        }*/

    }

}
