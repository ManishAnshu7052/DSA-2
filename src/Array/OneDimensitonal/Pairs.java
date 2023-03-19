//Given an array of N integer, count the total pairs of integers that have a difference of K.

package Array.OneDimensitonal;
import java.util.Scanner;
public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        int K = sc.nextInt();

        int arr[] = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0;i<N;i++){
            for (int j=i+1;j<N;j++){

                if (arr[i] - arr[j] == K || arr[j] - arr[i] == K){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
