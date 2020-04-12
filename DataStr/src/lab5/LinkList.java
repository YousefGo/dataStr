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
 
      newLink.setNext(first);    // newLink --> old first
      first = newLink;            // first --> newLink
      
      }
  // -------------------------------------------------------------
   public void insertLast(int dd) // insert at start of list
      {                           // make new link
      Node newLink = new Node(dd);
      Node current = first;
      if (first==null)
      {
      first=newLink;
      }
      else{
      while( current.getNext() != null) {// 
      current = current.getNext();
      }
      current.setNext(newLink);
      }
   }// end insertLast
// -------------------------------------------------------------
   public int deleteFirst()      // delete first item
      {                           // (assumes list not empty)
      Node temp = first;          // save reference to link
      first = first.getNext();         // delete it: first-->old next
      temp.setNext(null);;
      return temp.getIdate();          // return deleted link
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
         current = current.getNext();  // move to next link
            
         }
   
      }
// -------------------------------------------------------------

   public Node find(int key) {
   Node current = first;
   while ( current != null) {
       if(current.getIdate()== key) {
       return current;
       }//if
       current= current.getNext();
       
   }// while
   return null;
   }
   
   
   public Node delete(int key) {
   Node prev= first;
   Node current = first;
   
   while ( current != null) {
       if(current.getIdate() == key) {
         prev.setNext(current.getNext());
         current.setNext(null);
         return current;
       }//if
       prev = current;
       current = current.getNext();
       
   }// while
   return null;
   
   }
   public Node deleteLast() {
   Node current = first;
   Node prev = first;
   Node temp = null;
   while(current.getNext() != null ) { // 1 2 4 
       prev = current;        //1 //2
       current = current.getNext();//2 //4
   }// end while
   temp= current; //4
   prev.setNext(null);  
   return temp;
   }// end deleteLast
// -------------------------------------------------------------
   public boolean findRec(Node s ,int n )
           
   {
     if (s==null)  
     {
     return false ;
     }
       
   if (s.getIdate()==n)
   {
   return true;
   }

   else {
   return findRec(s.getNext(),n);
   }
   }
   
   }  // end class LinkList
