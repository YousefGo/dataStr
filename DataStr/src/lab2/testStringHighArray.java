/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

public class testStringHighArray {

    public static void main(String[] args) {
        HighArrayString s = new HighArrayString();
        s.insert("yousef");
        s.insert("fahed");
        s.insertFirst("waleed");
        s.insertFirst("shaime");
       s.insert("yousef");
           s.insertFirst("shaifhffhme");
     
    //    s.setStringAt(6, "ego");
          System.out.println(s.chackUniqe());     
    }

}
