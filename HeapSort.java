package gfg50_array;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {22, 13, 17, 11, 10, 14, 12};
        HeapSort hs = new HeapSort();
        hs.sort(arr);
        hs.printArray(arr);
    }

    void sort(int[] arr) {
        int leng = arr.length;

        for (int i = leng / 2 - 1; i >= 0; i--) {
            heapify(arr, leng, i);
        }
        for (int i = leng - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int li = 2 * i + 1;
        int ri = 2 * i + 2;

        if (li < n && arr[li] > arr[largest]) {
            largest = li;
        }
        if (ri < n && arr[ri] > arr[largest]) {
            largest = ri;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i + "");
        }
    }

}
