package Function;

public class Parameter2 {
    static void myMethod(String fname, int age){
        System.out.println(fname + " is " + age);
    }
    public static void main(String[] args) {
        myMethod("Manoj", 40);
        myMethod("Manish", 23);
        myMethod("Avanish",19);
    }
}
