package complexity;

public class ComplexityAnalysis {
    public ComplexityAnalysis() {
        // O(1)
        o1(10);
        on(10);
    }

    // O(1)
    public void o1(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("O(1): sum = " + sum);
    }

    // O(n)
    public void on(int n) {
        int sum = 0;
        int j;
        for (int i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                sum = sum + i + j;
            }
        }
        System.out.println("O(n): sum = " + sum);
    }

    //
}
