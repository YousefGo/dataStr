/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Root
 */
////////////////////////////////////////////////////////////////
import java.util.*;               
class TreeApp
   {
   public static void main(String[] args)       {
      int value;
      Tree theTree = new Tree();

      theTree.insert(50);
      theTree.insert(25);
      theTree.insert(75);
      theTree.insert(12);
      theTree.insert(37);
      theTree.insert(66);
      theTree.insert(80);
 
  /*     System.out.println("--------------Rec MaX----------------");
       System.out.println(theTree.maxRec(theTree.getRoot()));
       System.out.println("---------------Max----------------");
       System.out.println(theTree.max(theTree.getRoot()));
       System.out.println("--------------Min-------------------");
       System.out.println(theTree.min(theTree.getRoot()));
       System.out.println("-------------rec min -----------------");
        System.out.println(theTree.minRec(theTree.getRoot()));*/
      while(true)
         {
         System.out.print("Enter first letter of show, ");
         System.out.print("insert, find, V findRec,delete, or traverse: ");
         Scanner in = new Scanner(System.in);
         
         char choice = in.next().charAt(0);
         switch(choice)
            {
            case 's':
               theTree.displayTree();
               break;
            case 'i':
               System.out.print("Enter value to insert: ");
               value = in.nextInt();
               theTree.insert(value);
               break;
            case 'f':
               System.out.print("Enter value to find: ");
               value = in.nextInt();
               TNode found = theTree.find(value);
               if(found != null)
                  {
                  System.out.print("Found: ");
                  found.displayNode();
                  System.out.print("\n");
                  }
               else
                  System.out.print("Could not find ");
                  System.out.print(value + '\n');
               break;
            case 'd':
               System.out.print("Enter value to delete: ");
               value = in.nextInt();
               boolean didDelete = theTree.delete(value);
               if(didDelete)
                  System.out.print("Deleted " + value + '\n');
               else
                  System.out.print("Could not delete ");
                  System.out.print(value + '\n');
               break;
            case 't':
               System.out.print("Enter type 1, 2 or 3: ");
               value = in.nextInt();
               theTree.traverse(value);
               break;
            case 'v':
                System.out.println("Find by rec Enter Number");
                value= in.nextInt();
                System.out.println(theTree.findRec(value,theTree.getRoot()));   
                break;
            default:
               System.out.print("Invalid entry\n");
            } //end switch
         }  //
      }  // end main()
// -------------------------------------------------------------
   }  // end class TreeApp
////////////////////////////////////////////////////////////////

