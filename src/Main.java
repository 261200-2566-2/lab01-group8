// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        if (size <= 0) {
            System.out.println("Cannot be less than or equal to 0");
        } else {
            // Press Shift+F10 or click the green arrow button in the gutter to run the code.
            for (int i = 0; i < size; i++) {
                // Press Shift+F9 to start debugging your code. We have set one breakpoint
                // for you, but you can always add more by pressing Ctrl+F8.
                int[] intArray = new int[size];
                Scanner n = new Scanner(System.in);
                for (int j = 0; j < size; j++) {
                    intArray[j] = n.nextInt();
                }
                sort(intArray);
                System.out.println(size);
                for (int k = 0; k < size; k++) {
                    System.out.println(intArray[k]);
                }
            }
        }
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}