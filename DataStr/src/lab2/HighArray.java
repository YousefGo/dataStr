/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
// highArray.java
// demonstrates array class with high-level interface

import java.io.File;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////
public class HighArray {

    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-----------------------------------------------------------

    public HighArray(int max) // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }

    //-----------------------------------------------------------
    public boolean find(long searchKey) {                              // find specified value
        int j;
        for (j = 0; j < nElems; j++) // for each element,
        {
            if (a[j] == searchKey) // found item?
            {
                break;                       // exit loop before end
            }
        }
        if (j == nElems) // gone to end?
        {
            return false;                   // yes, can't find it
        } else {
            return true;                    // no, found it
        }
    }  // end find()
    //-----------------------------------------------------------

    public void insert(long value) // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }

    private void insert(int pos, long value) // put element into array
    {
        a[nElems + pos] = value;             // insert it
        nElems++;                      // increment size
    }

    //-----------------------------------------------------------
    public void insertOrdered(long value) // put element into array
    {
        int j;
        for (j = 0; j < nElems; j++) // find where it goes
        {
            if (a[j] > value) // (linear search)
            {
                break;
            }
        }
        for (int k = nElems; k > j; k--) // move bigger ones up
        {
            a[k] = a[k - 1];
        }
        a[j] = value;                  // insert it
        nElems++;                      // increment size
    }  // end insert()
    //-----------------------------------------------------------

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) // look for it
        {
            if (value == a[j]) {
                break;
            }
        }
        if (j == nElems) // can't find it
        {
            return false;
        } else // found it
        {
            for (int k = j; k < nElems; k++) // move higher ones down
            {
                a[k] = a[k + 1];
            }
            nElems--;                   // decrement size
            return true;
        }
    }  // end delete()
    //-----------------------------------------------------------

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(a[j] + " ");  // display it
        }
        System.out.println("");
    }
    //-----------------------------------------------------------

    public int binarySearch(int searchKey) {
        int left = 0, right = nElems - 1;

        while (left <= right) {
            int pivot = (left + right) / 2;
            if (a[pivot] == searchKey) {
                System.out.println("Right: " + right + "\tleft: " + left + "\t piovt :" + pivot);
                return pivot;       // found
            } else {
                if (a[pivot] < searchKey) {
                    left = pivot + 1;  // search right
                    System.out.println("Right: " + right + "\tleft: " + left + "\t piovt" + pivot);
                } else {
                    System.out.println("Right: " + right + "\tleft: " + left + "\t  piovt" + pivot);
                    right = pivot - 1;  // search left
                }
            }
        }
        return -1;
    }

    public int size() {
        return nElems;
    }
//

    public void deleteAll(int n) {
        boolean con = true;
        while (con) {
            if (this.find(n)) {// use find methed as condtiones 
                delete(n); // delet elemnt n 
            } else {
                con = false;
            }
        }
    }

    public int findAll(long t) {

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            {
                if (t == a[i]) {
                    count++;
                }

            }
        }
        return count;
    }

    public long[] findAllIndex(long t) {
        long[] ind = new long[findAll(t)];
        int count = 0;
        for (int i = 0; i < this.nElems; i++) {
            if (a[i] == t) {
                ind[count] = i;
                count++;
            }
        }
        return ind;
    }

    public long max() {
        long max = this.a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public long min() {
        long min = this.a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public long range() {
        return max() - min();
    }

    public int maxIndex() {
        int mIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[mIndex]) {
                mIndex = i;
            }
        }
        return mIndex;
    }

    public int MinIndex() {
        int minIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public boolean checkOrder() {
        for (int i = 0, j = 1; j < this.nElems; i++, j++) {
            if (a[i] > a[j]) {
                return false;
            }
        }
        return true;
    }

    public void removeDeplicate() {
        long tempArray[] = new long[nElems];
        int count = 0;
        for (int i = 0; i < nElems; i++) {
            if (!InArray(tempArray, a[i])) {
                tempArray[count] = a[i];
                count++;
            }

        }
        a = new long[a.length];
        nElems = 0;
        for (int i = 0; i < count; i++) {
            insert(tempArray[i]);
        }
    }

    public void fullAllIndex() {
        for (int i = 0; i < a.length; i++) {
            a[i] = 1 + (long) (Math.random() * a.length);
            nElems++;
        }

    }

    public boolean checkUniqe()// طريقة شيك بطريقة حسابية اذا كان حاصل طرح قيمة اثنين من العناصر داخل المصفوفة بصفر فهذا يعني التكرار 
    {
        for (int i = 0; i < nElems - 1; i++) {
            for (int j = i + 1; j < nElems; j++) {
                if (a[i] - a[j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public long sum() {
        long tsum = 0;
        for (long s : a) {
            tsum = tsum + s;
        }
        return tsum;
    }

    public double avg() {
        return sum() / this.nElems;
    }

    public double std() {

        HighArray arrtemp = new HighArray(nElems);
        for (int i = 0; i < nElems; i++) {
            arrtemp.a[i] = (long) Math.pow(avg() - a[i], 2);
        }
        return Math.sqrt(arrtemp.sum() / nElems);
    }

    public long rank(int r)// find the number of rank ar array 
    {
        sortArray();
        int rankDgree = 0;
        for (int i = 0; i < this.nElems; i++) {
            if (a[i] == (long) r) {
                rankDgree = i;
            }
        }
        return rankDgree + 1;
    }

    public void sortArray() {
        for (int i = nElems - 1, j = nElems - 2; j >= 0; i--, j--) {
            if (a[j] > a[i]) {
                long temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    public boolean InArray(long[] lArray, long value) {
        for (int i = 0; i < lArray.length; i++) {
            if (value == lArray[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Read integers into array from named file. First element in file is a
     * count of number of integers contained in the file.
     *
     * 5.	Modify the HighArray class to implement the method specified below,
     * which reads integer data from a file to fill the array. The first integer
     * read from the file should indicate the number of integers contained in
     * the file which can be read into the array
     *
     * @param fileName name of file containing integer data
     */
    public void readIntFile(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        int s = 0;

        int i = 0;
        while (input.hasNextInt()) {
            int next = input.nextInt();
            this.insert(1, next);
            i++;
        }
        s = i;
        a[0] = s;

    }

    public boolean EnsureCapcity() // To Know if capcity  size avalibe or not 
    {
        return nElems + 1 <= a.length;
    }

    public void add(long x) {
        if (!EnsureCapcity()) {
            int temp = a.length * 2;

            long[] tempa = new long[temp];
            for (int i = 0; i < a.length; i++) {
                tempa[i] = a[i];
            }
            a = tempa;
        }
        a[nElems] = x;             // insert it
        nElems++;
    }

    public void insertFirst(long x) {

      instartAt(0,x);

    }

    public void instartAt(int index, long x) {

        shiftRight(index);
        a[index] = x;
        nElems++;
    }
        public void instartlast(long x) {
         
  int t =    nElems++;
        a[t] = x;
        
    }

    public long deleteFrist() {
        long t = a[0];
        shiftLeft(0);
        this.nElems--;
        return t;
    }
    
      public long deleteLast() {
      return this.deleteAt(nElems-1);
        
    }

    public long deleteAt(int index) {
        long s = a[index];
        shiftLeft(index);
        nElems--;
        return s;
    }

    public void shiftLeft(int index) {

        for (int i = index; i < nElems; i++) {
            a[i] = a[i + 1];

        }
    }

    public void shiftRight(int index) {
        for (int i = nElems; i > index; i--) {
            a[i] = a[i - 1];
        }

    }

    public boolean isEmpty() {
        return this.nElems == 0;
    }

    public boolean isFull() {
        return this.nElems == a.length;
    }
    public void setAt(int index , long value)
    {
    a[index]=value ;
    }
    public long get(int index)
    {
    return a[index];
    }
}  // end class HighArray

////////////////////////////////////////////////////////////////
