/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner ;
import java.util.Arrays;
public class StringIO {
    public static void main (String []args) throws FileNotFoundException
{
Scanner in = new Scanner(System.in);
    System.out.println("Please Enter file name ");
    String s = in.nextLine();
    Scanner input = new Scanner(new File(s));
    String [] arr = new String [100];
    int i =0 ; 
    while (input.hasNext())
    {
   String  next = input.next();
       arr[i]=next;
       i++;
    }
int nel=i;
    System.out.println("Array contantes ");
   for (i=0 ;i<nel;i++)
   {
       System.out.println(i+"\t"+arr[i]);
   }
}

    
}
