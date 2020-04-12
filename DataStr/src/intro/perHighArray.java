/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intro;
import lab2.HighArray;
public class perHighArray {
    HighArray h ;
    public perHighArray(int size)
    {
    h = new HighArray(size);
    }
    public void PerformanceInstrtOrdered(long n )
    {
    double start =System.currentTimeMillis();
    for(int i =0 ;i<n ;i++)
    {
    h.insertOrdered(10);
  //  h.display();
    }
    double end =System.currentTimeMillis();
     double res =(end-start)/1000;
        System.out.println("Big O ("+n+")took..."+res);
    }
        public void PerformanceInstrtNotOrdered(long n )
    {
    double start =System.currentTimeMillis();
    for(int i =0 ;i<n ;i++)
    {
    h.insert((long)(Math.random()*100));
 //   h.display();
    }
    double end =System.currentTimeMillis();
     double res =(end-start)/1000;
        System.out.println("Big O Not Order take  ("+n+")took..."+res);
    }
    public void linertest(long x )
    {
        double start =System.currentTimeMillis();
        System.out.println(h.find(x));
               double end =System.currentTimeMillis();
                    double res =(end-start)/1000;
        System.out.println("Big O Not Liner take  ("+")took..."+res);
               
 
    }
     public void binary(int x )
    {
        double start =System.currentTimeMillis();
        System.out.println(h.binarySearch(x));
               double end =System.currentTimeMillis();
                    double res =(end-start)/1000;
        System.out.println("Big O Not Liner take  ("+")took..."+res);
               
 
    }
    
    
}
