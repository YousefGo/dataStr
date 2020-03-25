/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import lab2.HighArray;
public class QueueArrayV1 {
    HighArray arr ;
    public QueueArrayV1(int size)
    {
    arr = new HighArray(size);
    }
    public void enQueue (long x)
    {
    arr.instartlast(x);
    }
    public long dQueue ()
    {
    return arr.deleteFrist();
    }
    public boolean isEmpty()
    {
    return arr.isEmpty();
    }
    public boolean isFull()
    {
    return arr.isFull();
    }
    public void dispaly ()
    {
    arr.display();
    }
}
