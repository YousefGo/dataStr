/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.*;
/**
 *
 * @author Root
 */
public class fast {
    public static void main (String[]args )
    {
        int [] x = {11,23,64,85,14,5,6,3,0,1,5,4,-9};
        Arrays.sort(x);
        System.out.println( Arrays.binarySearch(x, 23)); ;
        System.out.println(Arrays.toString(x));
        
}
public static int[] xMethod() { 
    return new int[]{12,15,64,87};
  }


}
