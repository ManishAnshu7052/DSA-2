// Given an array of integer , calculate the radios of its elements that are positive and negative and zero.
// Print the decimal value of each fraction on a new line//

package Array.OneDimensitonal;
import java.util.Scanner;
public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double negative = 0;
        double positive = 0;
        double zeroes = 0;

        for (int i=0;i<n;i++){
            int data = sc.nextInt();
            if (data<0){
                negative++;
            } else if (data>0) {
                positive++;
            }
            else {
                zeroes++;
            }
        }
        double total = n;
        System.out.println(negative/total);
        System.out.println(positive/total);
        System.out.println(zeroes/total);
    }
}
