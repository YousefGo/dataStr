/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import lab5.*;
/**
 *
 * @author Root
 */
class Tree {

    private TNode root;             // first node of tree

// -------------------------------------------------------------
    public Tree() // constructor
    {
        root = null;
    }            // no nodes in tree yet
// -------------------------------------------------------------

    public TNode getRoot() {
        return root;
    }

    public TNode find(int key) // find node with given key
    {                           // (assumes non-empty tree)
        TNode current = root;               // start at root
        while (current.getiData() != key) // while no match,
        {
            if (key < current.getiData()) // go left?
            {
                current = current.getLeftChild();
            } else // or go right?
            {
                current = current.getRightChild();
            }
            if (current == null) // if no child,
            {
                return null;                 // didn't find it
            }
        }
        return current;                    // found it
    }  // end find()
// -------------------------------------------------------------

    public void insert(int id) {
        TNode newNode = new TNode();    // make new node
        newNode.setiData(id);           // insert data
        if (root == null) // no node in root
        {
            root = newNode;
        } else // root occupied
        {
            TNode current = root;       // start at root
            TNode parent;
            while (true) // (exits internally)
            {
                parent = current;
                if (id < current.getiData()) // go left?
                {
                    current = current.getLeftChild();
                    if (current == null) // if end of the line,
                    {                 // insert on left
                        parent.setLeftChild(newNode);
                        return;
                    }
                } // end if go left
                else // or go right?
                {
                    current = current.getRightChild();
                    if (current == null) // if end of the line
                    {                 // insert on right
                        parent.setRightChild(newNode);
                        return;
                    }
                }  // end else go right
            }  // end while
        }  // end else not root
    }  // end insert()
// -------------------------------------------------------------

    public boolean delete(int key) // delete node with given key
    {                           // (assumes non-empty list)
        TNode current = root;
        TNode parent = root;
        boolean isLeftChild = true;

        while (current.getiData() != key) // search for node
        {
            parent = current;
            if (key < current.getiData()) // go left?
            {
                isLeftChild = true;
                current = current.getLeftChild();
            } else // or go right?
            {
                isLeftChild = false;
                current = current.getRightChild();
            }
            if (current == null) // end of the line,
            {
                return false;                // didn't find it
            }
        }  // end while
        // found node to delete

        // if no children, simply delete it
        if (current.getLeftChild() == null
                && current.getRightChild() == null) {
            if (current == root) // if root,
            {
                root = null;                 // tree is empty
            } else if (isLeftChild) {
                parent.setLeftChild(null);     // disconnect
            } else // from parent
            {
                parent.setRightChild(null);
            }
        } // if no right child, replace with left subtree  // right
        else if (current.getRightChild() == null) {
            if (current == root) {
                root = current.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
        } // if no left child, replace with right subtree
        else if (current.getLeftChild() == null) {
            if (current == root) {
                root = current.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
        } else // two children, so replace with inorder successor
        {
            // get successor of node to delete (current)
            TNode successor = getSuccessor(current);

            // connect parent of current to successor instead
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.setLeftChild(successor);
            } else {
                parent.setRightChild(successor);
            }

            // connect successor to current's left child
            successor.setLeftChild(current.getLeftChild());
        }  // end else two children
        // (successor cannot have a left child)
        return true;                                // success
    }  // end delete()
// -------------------------------------------------------------
    // returns node with next-highest value after delNode
    // goes to right child, then right child's left descendents

    private TNode getSuccessor(TNode delNode) {
        TNode successorParent = delNode;
        TNode successor = delNode;
        TNode current = delNode.getRightChild();   // go to right child
        while (current != null) // until no more
        {                                 // left children,
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();      // go to left child
        }
        // if successor not
        if (successor != delNode.getRightChild()) // right child,
        {                                 // make connections
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(delNode.getRightChild());
        }
        return successor;
    }
// -------------------------------------------------------------

    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1:
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder traversal:  ");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println();
    }

    //-------------------------------------------------------------
    public boolean findRec(int e, TNode n) {
        if (n == null) {
            return false;
        } else if (e == n.getiData()) {
            return true;
        } else if (e < n.getiData()) {
            return findRec(e, n.getLeftChild());
        } else {
            return findRec(e, n.getRightChild());
        }
    }
    //------------------------------------------------------------
    // Find Max with rec and without rec 
    //-------------------------------------------------------------

    public int maxRec(TNode Root) {
        if (Root.getRightChild() == null) {
            return Root.getiData();
        } else {
            return maxRec(Root.getRightChild());
        }
    }

    //-------------------------------------------------------
    public int max(TNode s) {
        int max = s.getiData();
        while (s.getRightChild() != null) {
            s = s.getRightChild();
            max = s.getiData();
        }  // end while 
        return max;
    }
  //-----------------------------------------------

    // find main with rec or not 
    //---------------------------------------------
    public int minRec(TNode n) {
        if (n.getLeftChild() == null) {
            return n.getiData();
        } else {
            return minRec(n.getLeftChild());
        }

    }

    //---------------------------------------------
    public int min(TNode s) {
        int max = s.getiData();
        while (s.getLeftChild() != null) {
            s = s.getLeftChild();
            max = s.getiData();
        }  // end while 
        return max;
    }

// -------------------------------------------------------------
    private void preOrder(TNode localRoot) {

        if (localRoot == null) { // this is base we could describe as end of stack of mehtods the top 
            return;
        }
        System.out.print(localRoot.getiData() + " ");
        preOrder(localRoot.getLeftChild());

        preOrder(localRoot.getRightChild());

    }
// -------------------------------------------------------------

    private void inOrder(TNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getLeftChild());
            System.out.print(localRoot.getiData() + " ");
            inOrder(localRoot.getRightChild());
        }
    }

    //------------------------------ In Order While Loop 


// -------------------------------------------------------------
    private void postOrder(TNode localRoot) {
        if (localRoot == null) { // this is base we could describe as end of stack of mehtods the top 
            return;
        }

        postOrder(localRoot.getLeftChild());

        postOrder(localRoot.getRightChild());

        System.out.print(localRoot.getiData() + " ");
    }
     // ---------------- pre Order while loop 
    
    
    //------------------------depth methods-----------
    public boolean depthfirst(int n ,TNode s)
    {
    boolean found =false;
    StackLinkList Mystack = new StackLinkList();
    if (s!=null)
    {
    Mystack.push(s.getiData());
    
    }
    do{
    Mystack.pop();
    if(s.getiData()==n)
    {
    found=true;
    }
    else {
    
    
    }
    }
    while(!Mystack.isEmpty()&!found);
    return found;
    }
   
// -------------------------------------------------------------

    public void displayTree() {
    }  // end displayTree()
// -------------------------------------------------------------
}  // end class Tree

