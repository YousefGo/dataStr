/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Root
 */
public class testQuee {
    
    public static void main(String[] args) {
        QueueArrayV1 q1 = new  QueueArrayV1(10);
        q1.enQueue(10);
        q1.enQueue(20);
         q1.enQueue(30);
        q1.enQueue(40);
         q1.enQueue(50);
        q1.enQueue(60);
     q1.dispaly();
     q1.dQueue();
     q1.dQueue();
     q1.dispaly();
    }
    
}
