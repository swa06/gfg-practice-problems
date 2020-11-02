package mathematics;

public class PallindromeNumber {
    public boolean isPallindrome(int number) {
        int givenNumber = number;
        int reverseNumber = 0;
        while (number > 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number = number / 10;
        }

        return givenNumber == reverseNumber;
    }
}
