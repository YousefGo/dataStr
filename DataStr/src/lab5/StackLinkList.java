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
public class StackLinkList extends LinkList {
    public StackLinkList() {
    super();
    }

 
    public void push (int dd)
    {
    super.insertFirst(dd);
    }
    public int  pop()
    {
    return super.deleteFirst();
 
    }
    public void dispaly()
    {
        super.displayList();
    }
    
}
