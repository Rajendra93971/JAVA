package gfg50_array;

public class LinerSearchStr {

    public static void main(String[] args) {
        String[] arr = {"Deepak", "Rohit", "Rahul", "Pavan"};

        String item = "pavan";
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(item)) {
                System.out.println("Item is Present in " + i + " Index Postion");
                temp += 1;
            }
        }
        if (temp == 0) {
            System.out.println("Not present");
        }
    }
}
