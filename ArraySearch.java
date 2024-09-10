package gfg50_array;

import java.util.Scanner;

public class ArraySearch {

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = kb.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println("Enter the search element:");
        int x = kb.nextInt();
        System.out.println(search(arr, x));
    }

    static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }
}
