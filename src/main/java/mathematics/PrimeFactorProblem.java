package mathematics;

public class PrimeFactorProblem {
    public void printPrimeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }
    }
}
