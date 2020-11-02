package mathematics;

public class GcdProblem {
    public int findGcdOfTwoNumbers(int a, int b) {
        while (a%b != 0){
            int temp = a;
            a = b;
            b = temp%b;
        }

        return b;
    }
}
