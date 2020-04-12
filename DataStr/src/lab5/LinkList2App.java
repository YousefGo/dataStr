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
class LinkList2App
   {
   public static void main(String[] args)
      {
      LinkList theList = new LinkList();  // make list
       // theList.insertFirst(10);
        theList.insertLast(55);
     // theList.displayList();              // display list

    Node f = theList.find(88);          // find item
      if( f != null)
         System.out.println("Found link with key " + f.getIdate());
      else
         System.out.println("Can't find link");

      Node d = theList.delete(66);        // delete item
      if( d != null )
         System.out.println("Deleted link with key " + d.getIdate());
      else
        System.out.println("Can't delete link");
      theList.displayList();

   /*   theList.displayList();              // display list
      theList.deleteLast();
      theList.displayList();
      theList.deleteFirst();
      theList.displayList();
      theList.insertLast(33);
      theList.displayList();
       theList.insertLast(80);
      theList.displayList();*/
      }  // end
   }  // end class LinkList2App
////////////////////////////////////////////////////////////////