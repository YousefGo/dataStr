/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Root
 */
public class MyString implements  main  {
    private String text ;
    private int length ;

    public MyString(String text) {
        this.text = text;
    }
    

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String toString()
    {
    return text;
    }

    public void setLength(int length) {
        this.length = text.length();
    }

    public int getLength() {
        return length  ;
    }
    
}
