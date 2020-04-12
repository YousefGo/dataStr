
package lab5;

/**
 *
 * @author Root
 */
public class QueueLinkList extends LinkList {
    
    public QueueLinkList()
    {
    super();
    }

 
    
    public void Equeu (int dd)
    {
    super.insertLast(dd);
    }
    public int  Dequeu()
    {
    return super.deleteFirst();
 
    }
    public void dispaly()
    {
        super.displayList();
    }
}
