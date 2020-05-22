/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import lab1.Person;
/**
 *
 * @author Root
 */
public class testHighArrayPerson {
    
    public static void main(String[] args) {
        HighArrayPerson s = new HighArrayPerson();
       Person i = new Person ("yosuef",13,180,"32");
       s.insert(i);
       s.insert(i);
      s.dispaly();

          System.out.println(s.chackUniqe());     
    }
    
    
}
