package bitwiseOperator;

public class KthBitSetChecker {
    public void isKthBitSet(int n, int k) {
        if ((n & (1 << (k - 1))) != 0)
            System.out.print("SET");
        else
            System.out.print("NOT SET");
    }
}
