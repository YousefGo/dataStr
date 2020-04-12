/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Root
 */
public class testStackLinkList {
       public static void main(String[] args) {
        StackLinkList s = new StackLinkList();
        for ( int i =10 ;i<=100;i=i+10)
        {
        s.push(i);
        }
       for (int i=0;i<10;i++)
       {
           System.out.println("i "+(i+1)+" \t"+s.pop());
       }
        
    }
    
    
}
