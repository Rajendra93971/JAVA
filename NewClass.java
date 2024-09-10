/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gfg50_array;

/**
 *
 * @author rajen
 */
class Solution11111 {

    public static void main(String[] args) {

//    public static void palinArray() {
        int n = 0, ans = 0;
        int[] arr = {111, 111, 222, 333};
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            n = arr[i];
            while (n > 0) {
                int rem = n % 10;

                n = n / 10;
                x = x * 10 + rem;
            }
            System.out.println(n);
        }

        //   if(x==arr[i]){
        //       temp++;
        // }
//            if (x == n) {
//
//            }
//            return false;
//
//        }
//        return true;
    }
}
