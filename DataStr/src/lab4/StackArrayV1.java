/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import lab2.HighArray;
public class StackArrayV1 {
    HighArray arr;
    public StackArrayV1 (int size)
    {
    arr = new HighArray(size);
    }
    public void push (long x )
    {
    arr.insertFirst(x);
    }
    public long pop()
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
   public void  dispaly ()
   {
   arr.display();
   
   }
}
