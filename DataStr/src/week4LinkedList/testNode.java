/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4LinkedList;

/**
 *
 * @author Root
 */
public class testNode {
    public static void main (String []args)
    {
        int sum =0;
    Node start = new Node(22);
    Node p = start ;
    for (int i =1 ; i<4;i++)
    {
        p.next= new Node(22+11*i);
        p.pervies=p;
        p=p.next;
    }
   p = start ;
    while (p!=null)
    {
      System.out.println(p); 
      
      p =p.next;
      
    }
   start =p;
    while (p!=null)
    {
     
    }
        System.out.println("the sum is "+sum);
      
 
    }
  
}
