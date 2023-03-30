package Array.Base;
import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Element:");
        int arr[] = new int[5];
        int brr[] = new int[5]; //copy array
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("First array elements :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nSecond array Elements :");
        for (int i=0;i<brr.length;i++){
            brr[i] = arr[i];
            System.out.print(brr[i]+" ");
        }

    }
}
