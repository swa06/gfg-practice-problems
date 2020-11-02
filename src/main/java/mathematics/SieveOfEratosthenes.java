package mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public void findPrimesTillN(int n) {
        boolean[] result = new boolean[n + 1];
        Arrays.fill(result, true);
        for (int i = 2; i * i <= n; i++) {
            if (isPrime(i)) {
                for (int j = i * i; j <= n; j = j + i) {
                    result[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (result[i]) System.out.println(i);
        }
    }

    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
