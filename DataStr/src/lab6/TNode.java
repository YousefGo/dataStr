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
public class TNode
   {
   private  int iData;              // data item (key)
   private  TNode leftChild;         // this node's left child
   private  TNode rightChild;        // this node's right child
   
   // first Contrcot 
   public TNode()
   {
   
   
   }
   // 2nd constrcot
 public TNode(int iDate,TNode leftChild,TNode rightChild)  
 { // here we use the set funtionc to inzdtionze the value 
 this.setiData(iData);
 this.setLeftChild(leftChild);
 this.setRightChild(rightChild);
 }
// seteer and getter 
    public int getiData() { //  get date 
        return iData;
    }

    public void setiData(int iData) { // set date 
        this.iData = iData;
    }

    public TNode getLeftChild() { // get left child of node 
        return leftChild;
    }

    public void setLeftChild(TNode leftChild) { // set of left child of node 
        this.leftChild = leftChild;
    }

    public TNode getRightChild() {  // get right child of node 
        return rightChild;
    }

    public void setRightChild(TNode rightChild) {//// get rightchild of node 
        this.rightChild = rightChild;
    }
 

   public void displayNode()      // display ourself
      {
      System.out.print('{');
      System.out.print(iData);
      System.out.print("} ");
      }
   }  