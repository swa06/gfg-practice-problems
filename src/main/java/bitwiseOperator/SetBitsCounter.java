package bitwiseOperator;

public class SetBitsCounter {
    /*
     * Using Brian Kernighan's Algorithm
     * */
    public int countSetBits(int n) {
        int setBits = 0;
        while (n > 0) {
            n = n & (n - 1);
            setBits++;
        }
        return setBits;
    }

    public int countSetBitsDontRunThis(int n) {
        int setBits = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                setBits++;
                n = n >> 1;
            }
        }
        return setBits;
    }
}
