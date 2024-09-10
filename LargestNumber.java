package gfg50_array;
//
//public class LargestNum {
//
//    public static void main(String[] args) {
//
//        int[] a = {6, 8, 2, 4, 3, 1, 5, 7};
//
//        int largest = Integer.MIN_VALUE;
//
//        int second_largest = Integer.MIN_VALUE;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > largest) {
//                second_largest = largest;
//                largest = a[i];
//            } else if (a[i] > second_largest && a[i] != largest) {
//                second_largest = a[i];
//            }
//        }
//        if (second_largest == Integer.MIN_VALUE) {
//            System.out.println("there is no second largest ele in the list");
//        } else {
//            System.out.println("Second largest value is " + second_largest);
//        }
//    }
//}

public class LargestNumber {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 35, 15};

        int largest = numbers[0]; // Assume the first element is the largest initially

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest number: " + largest);
    }
}
