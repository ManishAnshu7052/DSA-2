package Array.OneDimensitonal;
import java.sql.SQLOutput;
import java.util.Scanner;
public class FindArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element no:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<arr.length; i++){
             arr[i] = sc.nextInt();
        }
        System.out.print("Enter the find Element:");
        int data = sc.nextInt();
        for (int i=0; i<arr.length; i++){
            if (arr[i] == data){
                data = i;
                break;
            }
        }
        System.out.println(data);
    }
}
