
package week2;
public class PersonV2 extends Person {
private int height; // here add new attraibute 
public PersonV2()// empty constrcotr 
{
super(); 
height=0;    
}
public PersonV2(String name ,int age,int height)// initails height in constroor with name and age 
{
super(name,age);
setHeight(height);
}
public void setHeight(int height)// seeter 
{
this.height=height;
}
public int getHeight()//geter 
{
return this.height;
}
@Override
public String toString()
{
return "Person V2 ("+this.getName()+","+this.getAge()+","+this.getHeight()+")";
}
}
