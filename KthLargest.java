package gfg50_array;

public class KthLargest {

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};

        int k = 3;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println(k + " largest element is " + a[i]);
                break;
            } else {
                System.out.println(-1);
                
            }
        }
        System.out.println("______________________________");
    }

}

//
// int k = 3 ,i;
//        for ( i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//           
//        }
//         if (i == k - 1) {
//             int x=arr[i];
//             
//               return  x;
//                // break;
//            }
//            else{
//                return -1;
//    
