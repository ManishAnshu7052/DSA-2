package ControlStatement.CountDigit;

public class CountADigit {
    public static void main(String[] args) {
        int n = 12345;
        int dig = 0;
        while(n !=0){
            n=n/10;
            dig++;
        }
        System.out.println(dig);
    }
}
