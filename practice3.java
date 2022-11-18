//taha burak sahin
//Define in a program an array of non-negative integers and then print a vertical ‘histogram’ of data contained in the array,
package task6;
import java.util.Arrays;
import java.util.Scanner;
public class practice3 {
    static void smlstNonNeg(int arr[], int N)
    {
        int smNonNeg = 0;
        Boolean[] hash = new Boolean[N + 1];
        Arrays.fill(hash, false);
        for(int i = 0; i < N; i++)
        {

            if (arr[i] >= 0 && arr[i] < N)
            {
                hash[arr[i]] = true;
            }
            while (hash[smNonNeg])
            {
                smNonNeg++;
            }
            System.out.print(smNonNeg + " ");
        }
    }
    public static void main (String[] args)
    {
        int arr[] = { 0, 1, 5 };
        int N = arr.length;

        smlstNonNeg(arr, N);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the number 2: ");
        int secondNumber = sc.nextInt();


        System.out.print("Enter the number 3: ");
        int thirdNumber = sc.nextInt();


        for (int i = 0; i < firstNumber; i++) {

            System.out.print("*\n");

        }
    }
}
