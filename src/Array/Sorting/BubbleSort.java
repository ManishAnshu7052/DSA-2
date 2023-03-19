package Array.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {36,19,29,12,5};
        for (int i=0; i<arr.length; i++) { // round of element
            for (int j = 0; j < arr.length-1-i; j++) { // Adjustment
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            for (int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
