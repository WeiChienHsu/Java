import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input 5 numbers:");
        int[] myArray = getIntegers(5);
        printArray(sorIntegers(myArray));
    }

    public static int[] getIntegers(int number) {
        int [] values = new int[number];
        for( int i = 0; i < number; i++ ) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            int index = i;
            System.out.println(index + ". " + array[i]);
        }
    }
    // Bubble Sort
    public static int[] sorIntegers(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++ ){
            for (int j = i + 1; j < array.length; j++ ){
                if(array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}