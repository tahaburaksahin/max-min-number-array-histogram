//taha burak sahin
//Write a program which for a given array of ints prints all its elements, but each value
//only once, without repetitions and the number of different elements.

package task6;
public class practice5
{static void printDistinct(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        int j;
        for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
        if (i == j)
            System.out.print( arr[i] + " ");
    }
}
    public static void main (String[] args)
    {
        int arr[] = {2,3,4,3,2,6,3,6,8,2,9};
        int n = arr.length;
        printDistinct(arr, n);
        System.out.println("there are 6 different number");
    }
}
