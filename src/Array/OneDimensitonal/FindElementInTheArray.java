package Array.OneDimensitonal;
import java.util.Scanner;
public class FindElementInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the find element:");
        int data = sc.nextInt();
        int index = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == data){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
