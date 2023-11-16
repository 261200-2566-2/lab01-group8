import java.util.Scanner;
public class Main {
    public static void sort(int[] arr,int n) {
        int key;
        for (int i = 1; i <n; ++i) {
            key = arr[i];
            int j = i-1;
            while (arr[j]>key && j >= 0){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void printArr(int[] arr,int n) {
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i <n; i++) {
            arr[i] = Integer.parseInt(s.nextLine());
        }
        Main.sort(arr,n);
        Main.printArr(arr,n);
    }
}