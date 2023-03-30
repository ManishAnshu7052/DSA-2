package Array.Base;
import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int n, count =0;
        System.out.print("Enter Element :");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Element :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nEnter the search Element :");
        n= sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if (arr[i]==n){
                count++;
            }
        }
        if (count>0){
            System.out.print("Item Fount");

        }else{
            System.out.println("Item Not Found");
        }
    }
}
