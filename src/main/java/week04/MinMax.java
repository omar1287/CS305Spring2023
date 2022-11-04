package week04;

import static java.lang.Math.*;

public class MinMax {

    private final int[] arr;
    private final int n;

    public MinMax(int[] arr) {
        this.arr = arr;
        n = arr.length;
    }

    public int getMin() {
        return getMin(n - 1);
    }

    private int getMin(int i) {
        // here your code
        if (i == 0)
            return arr[0];
        int min = getMin(i - 1);
        return min(arr[i], min);
    }

    public int getMax() {
        return getMax(n - 1);
    }

    private int getMax(int i) {
        // here your code
        if (i == 0)
            return arr[0];
        int max = getMax(i - 1);
        return max(arr[i], max);
    }
}
