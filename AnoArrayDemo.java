package gfg50_array;

class AnoArrayDemo {

    public static void main(String[] args) {
//        int sum=0;
        AnoArrayDemo.sum(new int[]{10, 20, 30});
    }

    static void sum(int[] no) {
        int total = 0;
        for (int i : no) {
            total += i;
        }
        System.out.println("sum is " + total);
    }
}
