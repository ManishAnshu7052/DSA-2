package Array.Base;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter the Elements :");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Element :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nArray reverse Element:");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
