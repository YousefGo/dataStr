import java.util.Scanner;
import java.util.Arrays;
public class maxValue {
    
    
    public static void main(String []args)
    {
        Scanner i = new Scanner(System.in);
        int test[]= {4,6,8};
        System.out.println("Max WithOut Array ");
      int maxWithOutArray=  maxValue.FindMaxWithOutArray(test[0],test[1],test[2]);
        System.out.println("The max is "+maxWithOutArray); 
        System.out.println("The sum with Out array ");
         int sumwa= maxValue.FindSumWithOutArray(test[0],test[1],test[2]);
         System.out.println("the sum is "+sumwa);
         System.out.println("max with array methods ");
         System.out.println("max "+ maxValue.FindMaxByArray(test));
         System.out.println("find sum with array ");
         System.out.println("max is "+maxValue.FindSumByIndex(test));
         System.out.println("assing Value for array ");
         maxValue.GiveValueForArray(test);
         System.out.println("The new Value is ");
         System.out.println(Arrays.toString(test));
    
    }    
    public static int FindMaxWithOutArray(int a ,int b ,int c )
    {
    int max1 = Math.max(a, b);
    int max2;
    return max2=Math.max(max1, c);
    
    }
    public static int FindSumWithOutArray( int a ,int b ,int c )
    {
    return a +b +c ; 
    }
    public static int FindMaxByArray(int a [])
    {
        int max=a[0];
    for (int i=1;i<a.length-1;i++)
    {
    if (a[i]<a[i+1])
    {
    max=a[i+1];
    }
    }
    return max ;   
    }
    public static int FindSumByIndex(int a [])
    {
    int sum =a[0]; 
    for (int i=1;i<a.length;i++)
    {
    sum+=a[i];
    }
    return sum ;
    }
    public static void GiveValueForArray(int a[])
    {
     
        for (int i =0 ; i<a.length;i++)
        {
        a[i]= new java.util.Scanner(System.in).nextInt();
        }
    
    }
}
