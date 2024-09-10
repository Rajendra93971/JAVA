package gfg50_array;

public class fristDubNum {

    public static void main(String[] args) {
        int[] a = {6, 5, 3, 2, 5, 21, 2, 4};

        for (int i = 0; i < a.length - 1; i++) {
            int temp = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && (i != j)) {
                    System.out.println("First dependent is " + a[i]);
                    temp += 1;
                    break;
                }

            }
            if (temp > 0) {
                break;
            }

        }
    }

}
