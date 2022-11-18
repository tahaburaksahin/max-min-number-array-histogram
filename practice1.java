// taha burak sahin
//Write a program which finds the difference between the maximum and minimum
//elements of a given array.
package task6;
import java.util.*;
public class practice1 {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter elements in array");
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=9;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum element is "+max);
        System.out.println("Minimum element is "+min);


    }
}
