/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author Root
 */
/**
 * Implement a Symbol Balancer. Which tests and expression containing brackets
 * [](){} and determines if brackets are balanced. Implementation uses a
 * StackArray.
 * 
* @version 1.0 08
 * @author
 */
public class StackBracketTest {

    private String input;

    /**
     * Default Constructor
     *
     */
    public StackBracketTest() {
        input = null;
    }

    /**
     * Alternate Constructor Sets Expression to be evaluated
     *
     * @param in string containing expression to be balanced
     */
    public StackBracketTest(String in) {
        // complete
        setExpression(in);
    }

    /**
     * Set string containing expression to be evaluated
     *
     * @param in string containing expression to be balanced
     */
    public void setExpression(String in) {
        input = in;
    }

    /**
     * Evaluate expression and determine correctness
     *
     */
    public void check() {
        int stackSize = input.length();
        StackArray theStack = new StackArray(stackSize);
        boolean chksame = true;
        boolean cheempty=false;
        s:   for (int j = 0; j < input.length(); j++) {
            char chr = input.charAt(j);
            int ch = chr;
            // complete the following switch statement. 
            switch (ch) {

                // if char is an opening bracket i.e. [({ then push onto stack 
                case 40: // the (  ;
                case 91: // the { braket ascii table number;
                case 123: // the {  braket ascii Number

                    theStack.push(ch);

                    break;
                // if char is a closing bracket i.e. ] ) } then remove top 
                // element off stack (checking that stack is not empty) 
                case 41: // ) end 
                case 93: // ] end
                case 125: // } end
                    if (!theStack.isEmpty()) {
                        // and check that it is a matching opening bracket for 
                        // the current closing bracket
                        long s = theStack.pop();

                        if (ch - s == 2 || ch - s == 1) { // we have asclii code and we now the diffrent between ( and ) is two  ...
                            chksame = true;
                        } else {
                            chksame = false;
                            break s;
                        }
                    } // i if tack is empty then its and invalid expression. 
                    else {
                        cheempty = true;

                    }

            }
        }
        // Test that the stack is empty. If not the expression is invalid
        if (theStack.isEmpty() & chksame&!cheempty) {
            System.out.println("vailed Text");
        } else {
            System.out.println("Invaled Text");
        }

    }

    /**
     * This main method implements a little interactive test program which when
     * executed repeatedly prompts the user for an expression and tests the
     * expression.
     */
    public static void main(String[] args) throws IOException {

        String input;

    // Declare a variable of type StackBracketTest and create 
        // and assign to it and instance of StackBracketTest class. 
        StackBracketTest t1;
        Scanner in = new Scanner(System.in);
    // Which would be the most appropriate constructor to use here?

    // note this is a do while loop which is different to a while
        // loop in that it will always execute at least once. 
        // Can you determine what condition causes the loop to terminate? 
        do {
            System.out.print("Enter string containing delimiters: ");

      // read a string from the console using the Scanner
            // class.
            input = in.nextLine();

            // can you determine what this if statement is doing?  
            if (!input.equals("")) {
                // pass the string to the StackBracketTest object created
                t1 = new StackBracketTest(input);
                t1.check();
            }

        // Call the StackBracketTest check method.
        // Test result of check method and display result in form of
            // a message to the user e.g. “This statement is valid” 
        } while (!input.equals(""));
    }

}
