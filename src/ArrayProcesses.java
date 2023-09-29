import java.util.Scanner;

public class ArrayProcesses {
    private Scanner scanner = new Scanner(System.in);
    private int[] resultArray;


    public void start() {
        createArray();
        fillArray(resultArray);
        sortArrayFromMinToMax(resultArray);
        showArray(resultArray);
    }

    private int[] createArray() {
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        resultArray = new int[size];
        return resultArray;
    }

    private int[] fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Fill the " + (i+1) +  " element");
            resultArray[i] = scanner.nextInt();
        }
        return resultArray;
    }

    private void sortArrayFromMinToMax(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int k = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = k;
                }
            }
        }
    }

    private void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The " + (i+1) + " element is: " + arr[i]);
        }
    }

}
