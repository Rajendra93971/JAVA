/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gfg50_array;

import java.util.Scanner;

/**
 *
 * @author rajen
 */
public class Input_Lena {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = kb.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            System.out.print(arr[i] + " ");
        }

    }

}
