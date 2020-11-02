package mathematics;

public class FactorialProblem {
    public int findFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public int findFactorialUsingRecursion(int n) {
        if (n == 0 || n == 1) return 1;

        return n * findFactorialUsingRecursion(n - 1);
    }
}
