
package lab2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner ;
public class IOfile {
public static void main (String []args) throws FileNotFoundException
{
Scanner in = new Scanner(System.in);
    System.out.println("Please Enter file name ");
    String s = in.nextLine();
    Scanner input = new Scanner(new File(s));
    int [] arr = new int [100];
    int i =0 ; 
    while (input.hasNextInt())
    {
    int next = input.nextInt();
       arr[i]=next;
       i++;
    }
int nel=i;
    System.out.println("Array contantes ");
    for (i=0;i<nel;i++)
    {
    
        System.out.println(i+"\t"+arr[i]);
    }
}
    
    
}
