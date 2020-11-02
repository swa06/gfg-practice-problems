package mathematics;

public class LcmProblem {
    public int findLcmOfTwoNumber(int a, int b) {
        int numberA = a;
        int numberB = b;
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        return (numberA * numberB) / b;
    }
}
