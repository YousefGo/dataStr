/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import lab1.Person;
public class TNodePerson {
private Person iDate;
TNodePerson leftChild;
TNodePerson rightChild;

    public TNodePerson(Person iDate, TNodePerson leftChild, TNodePerson rightChild) {
        this.iDate = iDate;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public TNodePerson() {
    }

    public Person getiDate() {
        return iDate;
    }

    public void setiDate(Person iDate) {
        this.iDate = iDate;
    }

    public TNodePerson getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TNodePerson leftChild) {
        this.leftChild = leftChild;
    }

    public TNodePerson getRightChild() {
        return rightChild;
    }

    public void setRightChild(TNodePerson rightChild) {
        this.rightChild = rightChild;
    }
     public void dispaly()
     {
         System.out.println(this.iDate.toString());
     }
    
     public static void main (String []args)
     {
     TNodePerson i = new TNodePerson(new Person("yousef",160,50.0,"14"),null,null);
     i.dispaly();
     
     
     
     
     
     }
}
