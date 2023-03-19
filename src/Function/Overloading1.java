package Function;

public class Overloading1 {
    static int plusMethodInt(int x, int y){
        return x+y;
    }
    static double plusMethodDouble(double x, double y){
        return x+y;
    }
    public static void main(String[] args) {
        int myNum1 = plusMethodInt(21,23);
        double myNum2 = plusMethodDouble(23.5,12.5);
        System.out.println("int:" + myNum1);
        System.out.println("double:" + myNum2);
    }
}
