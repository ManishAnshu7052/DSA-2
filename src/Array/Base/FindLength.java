package Array.Base;
import java.util.Scanner;
public class FindLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Element :");
        int arr[] = new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nArray length" +" " +arr.length);


    }
}
