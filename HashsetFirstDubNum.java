package gfg50_array;

import java.util.HashSet;

public class HashsetFirstDubNum {

    public static void main(String[] args) {
        int temp = 0;
        int[] a = {6, 5, 3, 2, 5, 21, 2, 4};
        HashSet<Integer> hs = new HashSet<>();
        for (int i = a.length - 1; i >= 0; i--) {
            if (hs.contains((a[i]))) {
                temp = i;
            } else {
                hs.add(a[i]);
            }

        }
        if (temp != -1) {
            System.out.println("first dublicate element is" + a[temp]);
        } else {
            System.out.println("No frist element");
        }
    }

}
