/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 * Class Person.java
 * A simple class which provides an definition+
6540n of a Person object
 *
 * @version 3.0 Sept 2016
 * @author Nour
 */

public class Person {
  private String name;
  private int age;
  private double height ;
  /**
   * Default constructor creates an empty instance of a Person
   */
  public Person() {
   name = "";
   age = 0;
   height =0 ;
  }

  /**
   * Alternative Constructor which creates and initialises a
   * Person using the supplied parameters 
   *
   * @param nName used to set the Person name
   * @param nAge used to set the Person age
   */
  public Person(String nName, int nAge,double height) {
    name = nName;
    age = nAge;
    this.height=height;
  }

  /**
   * Retrieve the name of the Person 
   *
   * @return the Person name 
   */
  public String getName() {
    return name;
  }

  /**
   * Retrieve the age of the Person  
   *
   * @return the Person age 
   */
  public int getAge() {
    return age;
  }
public double getHeight()
{
return height; 
}
  /**
   * Update the name of the Person  
   *
   * @param nName the new Person name 
   */
public void setHeight(double height)
{
this.height=height;
}
  public void setName(String nName) {
    name = nName;
  }

  /**
   * Update the age of the Person
   *
   * @param nAge the new Person age 
   */
  public void setAge(int nAge) {
    age = nAge;
  }

  /**
   * Returns a string representation of the object. In general, the 
   * 'toString' method returns a string that "textually represents" this
   * object. The result should be a concise but informative representation
   * that is easy for a person to read. It is recommended that all Objects
   * provide this method.  
   *
   * @return String representation of an object 
   */
  public String toString() {
    return "Person(" + name + ", " + age + ','+height+ ")";
  }

}


