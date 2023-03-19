package Array.OneDimensitonal;
import java.util.Scanner;
public class Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Building No:");
        int Build = sc.nextInt();
        int arr[] = new int[Build];
        for (int i=0; i<Build; i++){
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int max = arr[0];
        for (int i=0;i<Build; i++){
            if (max<arr[i]){
                count++;
                max =arr[i];
            }
        }
        System.out.print(count);
    }
}
