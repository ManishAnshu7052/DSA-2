package ControlStatement.Factorial;

public class Main1 {
    public static void main(String[] args) {
        int fact = 1;
        int no = 5;
        for (int i=1;i<=no;i++){
            fact = fact*i;

        }
        System.out.println(" factorial of " + no +" is "+ fact);
    }
}
