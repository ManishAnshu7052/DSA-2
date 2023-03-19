package Function;

public class Return3 {
    static int myMethod(int x, int y){
        return x - y;
    }
    public static void main(String[] args) {
        int z = myMethod(10,6);
        System.out.println(z);
    }
}
