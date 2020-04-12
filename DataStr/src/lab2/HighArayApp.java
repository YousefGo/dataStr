/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.FileNotFoundException;
import java.util.Arrays;

class HighArrayApp {

    public static void main(String[] args) throws FileNotFoundException {
        int maxSize = 10;            // array size
        HighArray arr;                // reference to array
        arr = new HighArray(maxSize); // create the array
        //   arr.insert(maxSize);
        //arr.insert(55);
        /*     arr.insert(5);               // insert 10 items
    
         arr.insert(88);
         arr.insert(7);
         arr.insert(14);
         arr.insert(7);
         arr.insert(14);*/

  //    arr.insert(49);
        /*    arr.insert(33);
         arr.insert(33);
         arr.insert(99);
         arr.insert(22);
         arr.insert(88);
         arr.insert(33);

         arr.insert(11);
         arr.insert(00);
         arr.insert(66);
         arr.insert(33);*/
        // display items

        /*   int searchKey = 35;           // search for item
         if( arr.find(searchKey) )
         System.out.println("Found " + searchKey);
         else
         System.out.println("Can't find " + searchKey);

         arr.delete(00);               // delete 3 items
         arr.delete(55);
         arr.delete(99);*/
        /*       System.out.println("after delete All");
         arr.display();
         System.out.println(arr.findAll(33));
         long []c =arr.findAllIndex(33);
         System.out.println(Arrays.toString(c));*/
        /*  System.out.println("Max value is "+arr.max());
         System.out.println("max index  is "+arr.maxIndex());
         System.out.println("min value is "+arr.min());
         System.out.println("min index is "+ arr.MinIndex());
         System.out.println("is it in Order "+arr.checkOrder());
         System.out.println("Range is "+ arr.range());
         /*    arr.removeDeplicate();*/
        /* arr.display();
         System.out.println("Binray Search "+ arr.binarySearch(71)); 
         System.out.println("Sum  is " +arr.sum());
         System.out.println("Avg is "+arr.avg());
         System.out.println("std  "+arr.std());
         // arr.fullAllIndex();
         System.out.println("Rank is "+arr.rank(14));
         System.out.println("is it in Order  "+arr.checkOrder());
         arr.display();
         System.out.println("is Uniqe : "+arr.checkUniqe());
         arr.removeDeplicate();
         arr.display();*/
        arr.insert(5);
        arr.insert(3);
        arr.insert(17);
          arr.insert(45);
        arr.insert(80); 
        arr.insert(80);
         arr.insert(580);
          arr.insert(570);
        arr.insert(2);
         arr.add(175);
         System.out.println(arr.size());
         arr.insert(58);
         arr.insert(87);
         
       //   arr.insert(4870);
     //   arr.insert(287);
   //      System.out.println(arr.size());
     //    arr.performanceInsertOrder(48);
          arr.display();
        arr.sortArray();
        arr.display();
       
     //   arr.instartlast(50);
        // arr.display();
        // arr.instartAt(2, 205);
    
      //  arr.display();
        // arr.display();
        //    arr.display();
//      arr.deleteAt(2);
        //    arr.display();
        //arr.instartAt(2, 50);
        //  arr.display();
        // display items again
    }  // end main()
}  // end class HighArrayApp
