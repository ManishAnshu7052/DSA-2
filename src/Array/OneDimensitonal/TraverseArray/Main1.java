package Array.OneDimensitonal.TraverseArray;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of elements:");
        int n = sc.nextInt();
         int arr[] = new int[n];
         for (int i=0; i< arr.length; i++) {
             arr[i] = sc.nextInt();
         }
        System.out.println("The entered array is:");
         for (int i=0; i< arr.length; i++){
             System.out.println(arr[i] + " ");
         }
    }
}

