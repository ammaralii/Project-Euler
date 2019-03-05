package sample;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public static void main(String[] args) {
        int n = largestPalindromeProduct();
        System.out.println("Is palindrome: "+isPalindrome(n));
        System.out.println("number is: "+n);
    }

    private static boolean isPalindrome(int number) {

        int n = 0;
        int temp = number;

        while (number > 0) {
            n = n * 10 + number % 10;
            number = number / 10 | 0;
        }
        return n == temp;
    }

    /**
     * Use to get largest palindrome of two 3 digits number
     * @return two 3 digits largest palindrome number
     */
    private static int largestPalindromeProduct() {

        int r = 0;

        for (int p = 990; p > 99; p-= 11) {

            for (int q = 999; q > 99; q--) {

                int t = p * q;

                if (r < t && isPalindrome(t)) {
                    r = t;
                    break;
                } else if (t < r) {
                    break;
                }
            }
        }
        return r;
    }
}
