/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import lab4.StackArrayV1;
import lab4.QueueArrayV1;

/**
 *
 * @author Root
 */
public class testPerformace {

    public static void main(String[] args) {
      
        StackArrayV1 sa = new StackArrayV1(20_000);
        QueueArrayV1 qa = new QueueArrayV1(20_000);
        QueueLinkList ql = new QueueLinkList();
        StackLinkList sl = new StackLinkList();
        System.out.println("Copresion between LinkList and Array (Stack )");
        long startTime =System.currentTimeMillis();
        for (int i =0 ; i<20_000;i++)
        {
        sa.push(i);
        }
        long endTime =System.currentTimeMillis();
        System.out.println("Stack Array Perfomence is "+(endTime-startTime));
           startTime =System.currentTimeMillis();
        for (int i =0 ; i<20_000;i++)
        {
        sl.push(i);
        }
         endTime =System.currentTimeMillis();
        System.out.println("Stack LinkList  Perfomence is "+(endTime-startTime));
        System.out.println("============================");
        System.out.println("LinkList Vs Array (Queue)");
           startTime =System.currentTimeMillis();
        for (int i =0 ; i<20_000;i++)
        {
        qa.enQueue(i);
        }
         endTime =System.currentTimeMillis();
        System.out.println("queeu Array Perfomence is "+(endTime-startTime));
           startTime =System.currentTimeMillis();
        for (int i =0 ; i<20_000;i++)
        {
        ql.Equeu(i);
        }
         endTime =System.currentTimeMillis();
        System.out.println("queueu LinkList  Perfomence is "+(endTime-startTime));
        
        
        
    }
    
    
    

}
