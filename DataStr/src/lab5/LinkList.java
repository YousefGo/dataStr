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
////////////////////////////////////////////////////////////////
class LinkList
   {
   private Node first;            // ref to first item on list
// -------------// -------------------------------------------------------------
   public Node getFirst()         // get value of first
      { return first; }
// -------------------------------------------------------------
   public void setFirst(Node f)   // set first to new link
      { first = f; }
// -------------------------------------------------------------
   public LinkList()              // constructor
      { first = null; }           // no items on list yet
// -------------------------------------------------------------
   public boolean isEmpty()       // true if list is empty
      { return (first==null); }
 
// -------------------------------------------------------------
   public void insertFirst(int dd) // insert at start of list
      {                           // make new link
      Node newLink = new Node(dd);
      newLink.next = first;       // newLink --> old first
      first = newLink;            // first --> newLink
      }
  // -------------------------------------------------------------
   public void insertLast(int dd) // insert at start of list
      {                           // make new link
      Node newLink = new Node(dd);
      Node current = first;
      while( current.next != null) {
      current = current.next;
      }
      current.next= newLink;
   
   }// end insertLast
// -------------------------------------------------------------
   public int deleteFirst()      // delete first item
      {                           // (assumes list not empty)
      Node temp = first;          // save reference to link
      first = first.next;         // delete it: first-->old next
      temp.next = null;
      return temp.iData;          // return deleted link
      }
// -------------------------------------------------------------
   public ListIterator getIterator()  // return iterator
      {
      return new ListIterator(this);  // initialized with
      }                               //    this list
// -------------------------------------------------------------
   public void displayList()
      {
      Node current = first;       // start at beginning of list
      while(current != null)      // until end of list,
         {
         current.displayLink();   // print data
         current = current.next;  // move to next link
         }
      System.out.println("");
      }
// -------------------------------------------------------------

   public Node find(int key) {
   Node current = first;
   while ( current != null) {
       if(current.iData == key) {
       return current;
       }//if
       current= current.next;
       
   }// while
   return null;
   }
   
   
   public Node delete(int key) {
   Node prev= first;
   Node current = first;
   
   while ( current != null) {
       if(current.iData == key) {
         prev.next = current.next;
         current.next = null;
         return current;
       }//if
       prev = current;
       current = current.next;
       
   }// while
   return null;
   
   }
   public Node deleteLast() {
   Node current = first;
   Node prev = first;
   Node temp = null;
   while(current.next != null ) {
       prev = current;
       current = current.next;
   }// end while
   temp= current;
   prev.next = null;
   return temp;
   }// end deleteLast
// -------------------------------------------------------------
   }  // end class LinkList
