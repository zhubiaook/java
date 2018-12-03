package complexity;

/**
 * Description
 *
 * @author Slynxes
 * @version 0.1
 * @ClassName ComplexityAnalysis
 * @createTime 2018-12-03 14:40:00
 */
public class ComplexityAnalysis {
    public ComplexityAnalysis() {
        /**
         * Construct
         * @title ComplexityAnalysis
         * @author Slynxes
         * @updateTime 2018-12-03 14:51
         */
        o1(10);
        on(10);
        ologn(10);
        osquare(10);
        onlogn(10);
    }

    public void o1(int n) {
        /**
         * O(1)
         * @title o1
         * @author Slynxes
         * @param: n
         * @updateTime 2018-12-03 15:07
         */
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("O(1): sum = " + sum);
    }

    // O(n)
    public void on(int n) {
        /**
         * O(n)
         * @title on
         * @author Slynxes
         * @param: n
         * @updateTime 2018-12-03 15:09
         */
        int sum = 0;
        int j;
        for (int i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                sum = sum + i + j;
            }
        }
        System.out.println("O(n): sum = " + sum);
    }

    public void ologn(int n) {
        /**
         * O(logn)
         * @title ologn
         * @author Slynxes
         * @param: n
         * @updateTime 2018-12-03 15:09
         */
        int sum = 0;
        for (int i = 1; i < n; i = 2 * i) {
            sum += i;
        }
        System.out.println("O(logn): sum = " + sum);
    }

    public void osquare(int n) {
        /**
         * O(n^2)
         * @title osquare
         * @author Slynxes
         * @param: n
         * @updateTime 2018-12-03 15:30
         */
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + i +j;
            }
        }
        System.out.println("O(n^2): sum = " + sum);
    }

    public void onlogn(int n) {
        /**
         * O(nlogn)
         * @title nlogn
         * @author Slynxes
         * @param: n
         * @updateTime 2018-12-03 15:37
         */
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j = 2 * j) {
                sum = sum + i + j;
            }
        }
        System.out.println("O(nlogn): sum = " + sum);
    }
}