package Array.Base;
//using for each loop
public class PrintElement2 {
    public static void main(String[] args) {
        int arr [] = new int[4];
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 24;
        for (int b : arr){
            System.out.print(b+ " ");
        }
    }
}
