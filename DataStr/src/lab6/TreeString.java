/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import lab1.Person;

public class TreeString {

    private TNodeString root = null;

    public TreeString() {
    }

    public TreeString(TNodeString n) {
        root = n;
    }

    public TNodeString getRoot() {
        return root;
    }

    public void setRoot(TNodeString root) {
        this.root = root;
    }

    public boolean yousef_method(String a, String b)// this is my great mehtod i create is compare full string 
    {
        int len_a = a.length(); // to get leght of 1st prameter 
        int len_b = b.length(); // to get lenght 2nd prameter 
        int minlen = Math.min(len_a, len_b); // take the min casue you will test all char on it 
        boolean res = false;
        for (int i = 0; i < minlen; i++) {
            if (a.charAt(i) < b.charAt(i)) {
                res = true;
                break;
            } else if (a.charAt(i) == b.charAt(i)) {
                continue;
            } else {
                res = false;
                break;
            }
        }
        return res;
    }

    public void insert(String id) { // the age is importment here insert depenat on it 
        TNodeString newNode = new TNodeString();    // make new node
        newNode.setiDate(id);           // insert data
        if (root == null) // no node in root
        {
            root = newNode;
        } else // root occupied
        {
            TNodeString current = root;       // start at root
            TNodeString parent;
            while (true) // (exits internally)
            {
                int count = 0;
                ;
                parent = current;
                if (this.yousef_method(id, current.getiDate())) // go left?
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
    }

    public boolean delete(String key) // delete node with given key
    {                           // (assumes non-empty list)
        TNodeString current = root;
        TNodeString parent = root;
        boolean isLeftChild = true;

        while (!current.getiDate().equals(key)) // search for node
        {
            parent = current;
            if (this.yousef_method(key, current.getiDate())) // go left?
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
            TNodeString successor = getSuccessor(current);

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
         return true;                                // success
    }
            //------------------------------------
       private TNodeString getSuccessor(TNodeString delNode) {
        TNodeString successorParent = delNode;
        TNodeString successor = delNode;
        TNodeString current = delNode.getRightChild();   // go to right child
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

    //---------------------------------
     private void preOrder(TNodeString localRoot) {

        if (localRoot == null) { // this is base we could describe as end of stack of mehtods the top 
            return;
        }
        System.out.print(localRoot.getiDate() + " ");
        preOrder(localRoot.getLeftChild());

        preOrder(localRoot.getRightChild());

    }
        private void inOrder(TNodeString localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getLeftChild());
            localRoot.dispaly();
            inOrder(localRoot.getRightChild());
        }
    }
 private void postOrder(TNodeString localRoot) {
        if (localRoot == null) { // this is base we could describe as end of stack of mehtods the top 
            return;
        }

        postOrder(localRoot.getLeftChild());

        postOrder(localRoot.getRightChild());

        System.out.print(localRoot.getiDate()+ " ");
    }

    public static void main(String[] args) {
        TreeString t = new TreeString();
        t.insert("ahlmed");
        t.insert("aahhh");
        t.insert("mohammed");
        t.insert("yosuef");
        t.insert("ibrahem");
        t.inOrder(t.getRoot());
        System.out.println(t.delete("mohammed"));

        System.out.println("after dleeter ---------------");
        t.inOrder(t.getRoot());

    }
}
