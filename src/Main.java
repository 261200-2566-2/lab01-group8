import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void printSort(int[] myList,int n) {
        Arrays.sort(myList);
        for (int i = 0; i <n; i++) {
            System.out.print(myList[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i <n; i++) {
            arr[i] = Integer.parseInt(s.nextLine());
        }
        Main.printSort(arr,n);
    }
}