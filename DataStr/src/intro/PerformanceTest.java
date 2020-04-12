/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

/**
 *
 * @author Root
 */
public class PerformanceTest {

    /**
     * Test linear performance
     *
     * @param n Size of test
     */
    public void linearTest(int n) {
        int loopcount = 0;
        double starttime = System.currentTimeMillis(); // or System.nanoTime
        System.out.print("O(" + n + ") took.. ");
        for (int i = 0; i < n; i++) {
            loopcount++;
        }
        double endtime = System.currentTimeMillis();
        System.out.println(((endtime - starttime) / 1000) + " seconds");

    }

    /**
     * Test Quadratic performance O(N^2)
     *
     * @param n Size of test
     */
    public void quadraticTest(int n) {
        int count = 0;
        double startTime = System.currentTimeMillis();
        System.out.printf("O(%d) took ", n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count++;
            }
        };
        double endTime = System.currentTimeMillis();
        System.out.println(((endTime - startTime) / 1000) + " Secneds");
    }

    /**
     * Test Cubic Performance O(N^3)
     *
     * @param n Size of test
     */
    public void cubicTest(int n) {
        int count = 0;
        double startTime = System.currentTimeMillis();
        System.out.printf("O(%d) took ", n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println(count++);
                }
            }
        }
        double endTime = System.currentTimeMillis();
        System.out.println(((endTime - startTime) / 1000) + "  Secneds");
    }

    /**
     * Main Method
     *
     * @param args commandline parameters (optional)
     */
    public static void main(String args[]) {
        PerformanceTest p = new PerformanceTest();

        // call methods of object p (PerformanceTest) with
        PerformanceTest t1 = new PerformanceTest();
        /*t1.linearTest(10);
         t1.quadraticTest(10);
         t1.cubicTest(10);

         System.out.println("Level 2");
         t1.linearTest(50);
         t1.quadraticTest(50);
         t1.cubicTest(50);
         System.out.println("Level 3");
         t1.linearTest(200);
         t1.quadraticTest(200);
         t1.cubicTest(200);
         System.out.println("LELEL 4 ");
         t1.linearTest(5000);
         t1.quadraticTest(5000);
         t1.cubicTest(5000);
         // various sizes of N and see the performance differences.
         System.out.println("Leve 5 ");
           
         t1.linearTest(20000);
         t1.quadraticTest(20000);
         t1.cubicTest(20000);
         */
        /*    System.out.println("Level 6");
         t1.linearTest(2*20000);
         t1.quadraticTest(2*20000);
         t1.cubicTest(2*20000);*/

        /*   System.out.println("Level 7");
         t1.linearTest(2*2*20000);
         t1.quadraticTest(2*2*20000);
         t1.cubicTest(2*2*20000);*/
        /*  System.out.println("Level 7");
         t1.linearTest(4 * 2 * 20000);
         t1.quadraticTest(4 * 2 * 20000);
         t1.cubicTest(4 * 2 * 20000);*/
        perHighArray p1 = new perHighArray(1000000);
   //    p1.PerformanceInstrtOrdered(100);
        //  p1.PerformanceInstrtNotOrdered(100);
        //    p1.PerformanceInstrtOrdered(1000);
        p1.PerformanceInstrtOrdered(300_000);//4 sec 
        //     p1.PerformanceInstrtNotOrdered(100000);
        //   p1.PerformanceInstrtOrdered(1000000);
    //    p1.linertest(11);
        p1.binary(45);
  //    p1.PerformanceInstrtNotOrdered(1000000);

    }
}
