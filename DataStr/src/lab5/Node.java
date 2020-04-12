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
class Node
   {
   private  int iData;              // data item (key)
   private  Node next;              // next link in list
// -------------------------------------------------------------
   public Node(int id) // constructor
      {
      iData = id;
      }
   // setter 
   public void setNext(Node next)
   {
   this.next=next;
   }
   public void setIdate(int idate)
   {
   this.iData=idate;
   }
   //--------------getter
   public Node getNext()
   {
   return next;
   }
   public int getIdate()
   {
   return this.iData;
   }
// -------------------------------------------------------------
   public void displayLink()      // display ourself
      {
      System.out.print("{" + iData + "} ");
      }
   }  // end class Link
//////
