/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Root
 */

import lab1.Person;
public class HighArrayPerson {

    private Person[] array; // name of array 
    private int pointer;  // number of elemnts 

    public HighArrayPerson() { // constrocrer
        pointer = 0;
        array = new Person[1];
    }

    public boolean EnsureCapcity() { // methods to knew if array can add or not 
        return pointer >= array.length;
    }

    public void SizeTracker() { // expand array 
        if (EnsureCapcity()) {
            int len = array.length * 2; // new size 
            Person temp[] = new Person[len]; // copy elemnts of array 
            for (int i = 0; i < array.length; i++) {  //  for to copy 
                temp[i] = array[i]; // each elemts 
            }
            array = new Person[len]; // assinge new double size

            array = temp; // reassing the address 
        }

    }

    public void insert(Person s) { // insert suquentail 
        this.SizeTracker(); // to check of size 
        array[pointer] = s; // assing 
        pointer++; // incremtn number of elemnts 
    }

    public void insertFirst(Person value) { // insert frist in array 
        this.SizeTracker(); // size tracker r
        this.shiftRight(1); // shift right postion 
        array[0] = value;
        pointer++;
    }

    public void insertLast(Person value) {
        this.SizeTracker();
        array[pointer] = value;///insert into last 
        this.pointer++;
    }

    // here there are may case , make idel code 
    public void insertAt(int index, Person value) {
        try {  // mabey there is sometings wrog so we use try 
            if (index <= 0) {// No Negtive index  ,so give try catch 
                throw new IllegalArgumentException("No Zero or minues Argments");
            } else if (index >= array.length + 1) { // Out of bound 
                throw new IllegalArgumentException("Can not add cause the argment "
                        + ""
                        + " please add until " + array.length);

            } else { // in range 
                this.SizeTracker();
                index--;
                if (index == 0) { // insert at frist index
                    insertFirst(value);
                } else if (index == array.length - 1) {
                    this.insertLast(value);
                } else {
                    this.shiftRight(index);
                    array[index] = value;
                    pointer++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void shiftRight(int index) {
        for (int i = array.length - 1; i >= index; i--) {
            array[i] = array[i - 1];
        }
    }

    public void setPersonAt(int index, Person s) {
        index = index - 1;
        try {
            if (!this.IsinRange(index)) {
                throw new IllegalArgumentException("Not index not at range ");
            }
            array[index] = s;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public Person getPerson(int index) {
        try {
            index--;
            if (!this.IsinRange(index)) {
                throw new IllegalArgumentException("Null");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return array[index];

    }
     /////////////////////////////////////////////////////////////////////////

    // delete
    public void deleteFrist() { // delete frist 
        shiftLeft(0);
    }

    public void deleteLast() {
        shiftLeft(array.length - 1);
    }

    public void deleteAt(int index) {

        index--;// same size with user enter 
        shiftLeft(index);
    }

    public void shiftLeft(int index) {
        // 
        if (index > pointer || index < 0) { // if prameter Out of ramge 
            System.out.println("Already Null value");
        } else {
            for (int i = index; i < this.pointer; i++) { // shift left
                array[i] = array[i + 1];
            }
            this.pointer--;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    public void dispaly() {
        for (int i = 0; i <= pointer - 1; i++) {
            System.out.print(array[i] + " , ");
        }
    }

    private boolean IsinRange(int index) {
        return index >= 0 && index < array.length;
    }

    public boolean find(String s) // find string in array
    {
        return findIndex(s) > -1;
    }

    public int findIndex(String name) {
        for (int i = 0; i < pointer; i++) {
            if (name.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean chackUniqe() {
        for (int i = 0; i < pointer; i++) {
            for (int j = i+1; j < pointer; j++) {
                if (array[i].equals(array[j])) {
                    return false;
                }
            }
        }
        return true;
    }
  public void bubbleSort()
  {
  for ( int i =0 ;i<this.pointer;i++)
  {
  for (int j =i+1;j<this.pointer-1;j++)
  {
      String name1=this.array[i].getName();
            String name2=this.array[j].getName();
  if(yousef_method(name2,name1))
  {
      Person temp=this.array[i];
      this.array[i]=this.array[j];
      this.array[j]=temp;
      
  }
  }
  }
  
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
                void selecttionsort() 
    { 
       
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i <this.pointer; i++) 
        { 
       // not comptleterd yet mp; 
        } 
    }
      
}

