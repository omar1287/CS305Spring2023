package ms.appendixb;

public class MaxPosition {

    private final int[] a;

    public MaxPosition(int[] a) {
        this.a = a;
    }

    public int maxPos(int low, int high) {
        if (low == high) return low;

        int pos = maxPos(low + 1, high);

        return (a[low] > a[pos]) ? low : pos;
    }
}
