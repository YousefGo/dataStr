/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import lab1.Person;

/**
 *
 * @author Root
 */
public class TreePerson {

    private TNodePerson root = null;

    public TreePerson() {
    }

    public TreePerson(TNodePerson n) {
        root = n;
    }

    public TNodePerson getRoot() {
        return root;
    }

    public void setRoot(TNodePerson root) {
        this.root = root;
    }

    public void insert(Person id) { // the age is importment here insert depenat on it 
        TNodePerson newNode = new TNodePerson();    // make new node
        newNode.setiDate(id);           // insert data
        if (root == null) // no node in root
        {
            root = newNode;
        } else // root occupied
        {
            TNodePerson current = root;       // start at root
            TNodePerson parent;
            while (true) // (exits internally)
            {
                parent = current;
                if (id.getAge() < current.getiDate().getAge()) // go left?
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
// -------------------------
    private void preOrder(TNode localRoot) {

        if (localRoot == null) { // this is base we could describe as end of stack of mehtods the top 
            return;
        }
        System.out.print(localRoot.getiData() + " ");
        preOrder(localRoot.getLeftChild());

        preOrder(localRoot.getRightChild());

    }
        private void inOrder(TNodePerson localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getLeftChild());
            localRoot.dispaly();
            inOrder(localRoot.getRightChild());
        }
    }
 private void postOrder(TNode localRoot) {
        if (localRoot == null) { // this is base we could describe as end of stack of mehtods the top 
            return;
        }

        postOrder(localRoot.getLeftChild());

        postOrder(localRoot.getRightChild());

        System.out.print(localRoot.getiData() + " ");
    }
    public static void main(String[] args) {
        TreePerson t = new TreePerson();
        t.insert(new Person("Ahmed", 12, 145,"15"));
        t.insert(new Person("fahed", 18, 145,"145"));
        t.insert(new Person("kheld", 17, 145,"158"));
        t.insert(new Person("waled", 15, 145,"1566"));
        t.insert(new Person("shmed", 13, 145,"155"));
        t.insert(new Person("ehmed", 32, 145,"155"));
        t.inOrder(t.getRoot());
    }
}
