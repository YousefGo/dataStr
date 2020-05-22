/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Root
 */
import java.util.Scanner;
import lab1.Person;

/**
 * Test hash table algorithm
 *
 */
public class HashTableTest {

    private HashTableLinear theHashTable;
    //private HashTableChaining theHashTable;

    /**
     * Default constructor
     */
    public HashTableTest() {
        theHashTable = new HashTableLinear();
        //theHashTable = new HashTableChaining();

        theHashTable.insert(new Person("yosuef", 22, 165, "1"));// that mean inboxing 
        theHashTable.insert(new Person("ahmed", 22, 165, "2"));// that mean inboxing 
        theHashTable.insert(new Person("fahemd", 22, 165, "3"));// that mean inboxing 
        theHashTable.insert(new Person("walled", 22, 165, "4"));// that mean inboxing 
        theHashTable.insert(new Person("salme", 22, 165, "5"));// that mean inboxing 
        theHashTable.insert(new Person("khan", 22, 165, "6"));// that mean inboxing 
        theHashTable.insert(new Person("same ", 22, 165, "7"));// that mean inboxing 
        theHashTable.insert(new Person("walled", 22, 165, "8"));// that mean inboxing 
        theHashTable.insert(new Person("mohdad", 22, 165, "9"));// that mean inboxing 
        theHashTable.insert(new Person("test", 22, 165, "10"));// that mean inboxing 

        theHashTable.print();
    }

    /**
     * Display menu
     */
    public void menu() {
        Person personJ;
        String name;
        int  age ;
        double height ;
        String id ;
        Scanner Console = new Scanner(System.in);
        while (true) {
            System.out.print("(p)rint (i)nsert (d)elete (f)ind (q)uit: ");
            char choice = Console.nextLine().charAt(0);
            switch (choice) {
                case 'p':
                    theHashTable.print();
                    break;

                case 'i':
                    System.out.print("Enter id of person : ");
                    id= Console.nextLine();
                    System.out.print("Enter name of  person : ");
                    name = Console.nextLine();
                    System.out.println("Enter age of person ");
                    age =Console.nextInt();
                    System.out.println("Enter the Hight of "+name);
                    height = Console.nextDouble();
                    Console.nextLine();
                    Person per  = new Person (name,age ,height,id);
                    theHashTable.insert(per);
                    break;

                case 'd':
                    System.out.print("Enter key value to delete: ");
                    id = Console.next();
                    Console.nextLine();
                    Person d = theHashTable.delete(id);
                    if (d == null) {
                        System.out.println("Not Deleted..");
                    }
                    break;

                case 'f':
                    System.out.print("Enter key value to find: ");
                    id= Console.nextLine();
                    personJ = theHashTable.find(id);

                    if (personJ != null) {
                        System.out.println("Found " + personJ);
                    } else {
                        System.out.println("Could not find " + id);
                    }
                    break;

                case 'q':
                    return;
                case 's':
                    System.out.println(this.theHashTable.isFull());
                    break;
                case 'm':
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid entry\n");
            }
        }
    }

    public static void main(String[] args) {
        HashTableTest test = new HashTableTest();

        test.menu();
    }
}
