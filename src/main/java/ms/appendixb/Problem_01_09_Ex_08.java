package ms.appendixb;

public class Problem_01_09_Ex_08 {

    /**
     * implement for f(n) = f(n-1) + 2n-1
     * f(1) = 1
     * ---> n > 1
     */
    static int impl(int n) {
        if (n < 1) throw new IllegalArgumentException("'n' must be grater than 1");

        if (n == 1) return 1;

        return impl(n - 1) + 2 * n - 1;
    }
}
