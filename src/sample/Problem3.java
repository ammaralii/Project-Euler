package sample;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
    public static void main(String[] args) {
        long n = 600851475143l;
        System.out.println(largestPrimeFactor(n));
    }

    /**
     * @see <a href="https://www.geeksforgeeks.org/java-program-for-find-largest-prime-factor-of-a-number/">find largest prime factor</a>
     * @param n
     * @return largest prime factor
     */
    public static long largestPrimeFactor(long n){
        // Initialize the maximum prime
        // factor variable with the
        // lowest one
        long maxPrime = -1;

        // Print the number of 2s
        // that divide n
        while (n % 2 == 0) {
            maxPrime = 2;

            // equivalent to n /= 2
            n /= 2;
        }

        // n must be odd at this point,
        // thus skip the even numbers
        // and iterate only for odd
        // integers
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
        }

        // This condition is to handle
        // the case when n is a prime
        // number greater than 2
        if (n > 2)
            maxPrime = n;

        return maxPrime;
    }
}
