/**
 * @(#) HashTableLinear.java
 *
 * HashTable implementation Using Open Addressing and Linear Probing.
 * 
*/
package lab7;
import lab1.Person;
public class HashTableLinear {

    private Person[] person; // array holds hash table
    private int nElems;           // number of elements in hashtable 

    private static final int DEFAULT_SIZE = 11; // default size

    /**
     * Default Constructor Creates a Hash Table of default size
     */
    public HashTableLinear() {
        this(DEFAULT_SIZE);
    }

    /**
     * Constructor to create Hash Table of specified size
     *
     * @param size size of hash table to create
     */
    public HashTableLinear(int size) {
        nElems = 0;
        person = new Person[size];
        for (int i = 0; i < person.length; i++) {
            person[i] = null;
        }
    }

    /**
     * Hash function generates hash value from key
     *
     * @param key key to hash
     * @param tableSize size of table key is generated for
     * @return hash value
     */
    public int hashFunc(String key, int tableSize) {
        int sum = 0;

        for (int i = 0; i < key.length(); i++) {
            sum = sum + (int) key.charAt(i);
        }
        return sum % tableSize;
    }

    /**
     * Insert a DataItem into the hash table
     *
     * @param item dataitem to insert
     */
    public void insert(Person item) {
        boolean find = !this.ISfind(item.getId());
        boolean full = !this.isFull();
        if (full & find) {

            int hashVal = hashFunc(item.getId(), person.length); // hash the key

            // loop until empty cell
            while (person[hashVal] != null) {
                hashVal++;                            // go to next cell
                hashVal = hashVal % person.length; // wrap around if necessary

            }
            person[hashVal] = item;              // insert item
            nElems++;
        }// increase element count
        else {
            System.out.println("The element does not add ");
        }
    }

    /**
     * Delete DataItem from HashTable identified by specified key
     *
     * @param key key identifying DataItem to delete
     * @return copy of deleted data item if found, otherwise null
     */
    public Person delete(String target) {

        int hashVal = hashFunc(target, person.length); // hash the key
        if (this.isFull()) {
            while (person[hashVal] != null) {
                if (this.ISfind(target)) {
                    return null;
                }
                if (person[hashVal].getId().equals(target)) { // if found key
                    Person temp = person[hashVal];       // save item
                    person[hashVal] = null;                // delete item
                    nElems--;                       // decrease element count
                    return temp;                    // return item
                }
                hashVal++;                        // go to next cell
                hashVal = hashVal % person.length; // wraparound if necessary

            }
            return null;// can't find item

        } // loop until empty cell
        else {
            while (person[hashVal] != null) {
                if (person[hashVal].getId().equals(target)) { // if found key
                    Person temp = person[hashVal];       // save item
                    person[hashVal] = null;                // delete item
                    nElems--;                       // decrease element count
                    return temp;                    // return item
                }
                hashVal++;                        // go to next cell
                hashVal = hashVal % person.length; // wraparound if necessary

            }
            return null;// can't find item
        }
    }

    /**
     * Search hash table for DataItem identifed by specifed key
     *
     * @param key key identifying DataItem to locate
     * @return DataItem if found otherwise null
     */
    public Person find(String target) {
        int hashVal = hashFunc(target, person.length); // hash the key
        if (this.isFull()) {
   
             {
                while (person[hashVal] != null) {
                        if (this.ISfind(target)) {
                    return null;
                }
                    if (person[hashVal].getId().equals(target)) { // if found key
                        return person[hashVal];
                    }
                    hashVal++;                             // go to next cell
                    hashVal = hashVal % person.length;  // wraparound if necessary
                }
                return null;
            }

        } // loop until empty cell,
        else {
            while (person[hashVal] != null) {
                if (person[hashVal].getId().equals(target)) { // if found key
                    return person[hashVal];
                }
                hashVal++;                             // go to next cell
                hashVal = hashVal % person.length;  // wraparound if necessary
            }
            return null;
        }                   // can't find item
    }

    /**
     * Provide printable representation of a hashtable
     *
     * @return String representation
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < person.length; i++) {
            if (person[i] == null) {
                buffer.append("empty\n");
            } else {
                buffer.append(person[i] + "\n");
            }
        }
        return buffer.toString();
    }

    /**
     * Print Elements in HashTable to Console
     *
     */
    public void print() {
        System.out.println(this.toString());
    }

    //-----------------------------------------------
    public boolean isFull() {
        for (int i = 0; i < this.person.length; i++) {
            if (this.person[i] == null) {
                return false;
            }
        }
        return true;
    }

    //------------------------------------------   
    public boolean ISfind(String target) {
        if (isFull()) {
            return true;
        }
        int hashVal = hashFunc(target, person.length); // hash the key

        // loop until empty cell,
        while (person[hashVal] != null) {
            if (person[hashVal].getId().equals(target)) { // if found key
                return true;
            }
            hashVal++;                             // go to next cell
            hashVal = hashVal % person.length;  // wraparound if necessary
        }
        return false;                             // can't find item
    }

}
