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
public class testQueueLinkList {
    
    public static void main(String[] args) {
        LinkList l = new LinkList ();
        QueueLinkList q = new QueueLinkList();
        for ( int i =10 ;i<=100;i=i+10)
        {
        q.Equeu(i);
        }
       for (int i=0;i<10;i++)
       {
           System.out.println("i "+(i+1)+" \t"+q.Dequeu());
       }
        
    }
    
}
