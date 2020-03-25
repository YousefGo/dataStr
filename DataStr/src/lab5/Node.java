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
   public int iData;              // data item (key)
   public Node next;              // next link in list
// -------------------------------------------------------------
   public Node(int id) // constructor
      {
      iData = id;
      }
// -------------------------------------------------------------
   public void displayLink()      // display ourself
      {
      System.out.print("{" + iData + "} ");
      }
   }  // end class Link
//////
