package Array.Base;
import java.util.Scanner;
public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum =0;
        System.out.print("Enter the element : ");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Array Element :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<arr.length;i++){
            sum = arr[i]+sum;
        }
        int avg = sum/5;
        System.out.print("\nSum is " +sum+" Avg is "+avg);

    }
}
