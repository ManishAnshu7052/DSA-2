package Loops.ForLoop;
//Q1 - n = 1 3 8 7 5 7 8 7 9 Ans- 3 (7 comes 3 times)
import java.util.Scanner;
public class Counting_Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers:");
        int n = sc.nextInt();
        int count = 0;
        for (int i=0; i<n; i++){
            int rem = n % 10;
            count = count +1;
             n = n/10;

    }
        System.out.println(count);
}
}
