package Array.OneDimensitonal;
import java.util.Scanner;
public class contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cont No:");
        int n = sc.nextInt();
        System.out.print("Find the next cont:");
        int k = sc.nextInt();
        int []arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i=0; i<n; i++){
            if (arr[i]>0 && arr[i]>=arr[k-1]){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
