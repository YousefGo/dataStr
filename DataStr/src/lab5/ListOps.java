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
import java.io.*;

/**
* LinkList Processing Class. 
* These methods are declared as static. They are general 
* purpose List processing methods which are not list 
* instance specific.
*
* 
*/

public class ListOps {
  /**
   * Return new List Which is formed by Intersection of
   * Two specified list parameters (i.e. elements common 
   * to both lists)
   *
   * @param a LinkList
   * @param b LinkList
   * @return a new LinkedList formed by Intersection 
   */
  public static LinkList intersection(LinkList a, LinkList b) {
    // Use implementation of this method as a guide for 
    //implementation of remaining methods
 
    // So firstly declare output list
    LinkList u = new LinkList();
	
    // Then iterate through list elements.	
    for (int i=0; i<a.length(); i++) {
      // retrieve element at position i in list a using retrieve(i)
      // method and check if it can be located in list b using
      // indexOf(Object) method which tests if object is in list b
    	if (b.indexOf(a.retrieve(i)) != -1) {
            // insert object into output list u at position 0
    		u.insert(0,a.retrieve(i));
    	}
    }
    return u;
  } 


  /**
   * Return new LinkList formed by Union of two
   * Lists specified as Parameters (i.e. elements in both lists 
   * but not duplicated) 
   *
   * @param a LinkList 
   * @param b LinkList 
   * @return new LinkList formed by Union 
   */
  public static LinkList union(LinkList a, LinkList b) {
    // union is set of elements in a and b but not duplicated
  } 

 
 /**
   * Return new List Which is formed by difference of
   * two specified list parameters (i.e. elements not common to
   * both lists) 
   *
   * @param a LinkList
   * @param b LinkList
   * @return new LinkList formed by complement 
   */
  public static LinkList difference(LinkList a, LinkList b) {
    // set of elements not common to a and b
  }

}
