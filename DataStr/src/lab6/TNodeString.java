/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

public class TNodeString {
    private String iDate ; 
    private TNodeString leftChild;
    private TNodeString rightChild;

    public TNodeString(String iDate, TNodeString leftChild, TNodeString rightChild) {
        this.iDate = iDate;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public TNodeString() {
    }

    public String getiDate() {
        return iDate;
    }

    public void setiDate(String iDate) {
        this.iDate = iDate;
    }

    public TNodeString getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TNodeString leftChild) {
        this.leftChild = leftChild;
    }

    public TNodeString getRightChild() {
        return rightChild;
    }

    public void setRightChild(TNodeString rightChild) {
        this.rightChild = rightChild;
    }
    public void dispaly ()
    {
        System.out.println(this.iDate.toString());
    }
    
    
    
    
}
