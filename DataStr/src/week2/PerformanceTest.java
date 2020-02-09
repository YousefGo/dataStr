
package week2;
/**
 * PerformanceTest.java
 * A class to test performance of linear, quadric and cubic algorithms
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PerformanceTest {

 /**
  * Test linear performance
  *
  * @param   n  Size of test 
  */
 public void linearTest(int n) {
    int loopcount=0;
    double starttime = System.currentTimeMillis(); // or System.nanoTime
    System.out.print("O(" + n + ") took.. ");
    for (int i=0; i<n; i++)
      loopcount++;  
    double endtime = System.currentTimeMillis();
    System.out.println(((endtime-starttime)/1000) + " seconds");
    
 }

 /**
  * Test Quadratic performance O(N^2)
  *
  * @param   n  Size of test 
  */
  public void quadraticTest(int n) {

  }

 /**
  * Test Cubic Performance O(N^3)
  *
  * @param   n  Size of test 
  */
  public void cubicTest(int n) {
  
  }
  
  
  /**
   * Main Method
   *
   * @param   args  commandline parameters (optional)
   */
  public static void main(String args[]) {
    PerformanceTest p = new PerformanceTest();
  
    // call methods of object p (PerformanceTest) with
    // various sizes of N and see the performance differences.

  } 
}
