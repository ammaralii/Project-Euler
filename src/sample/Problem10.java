package sample;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
public class Problem10 {
    public static void main(String[] args) {
        long n = System.currentTimeMillis();
        System.out.println(sumNPlacePrimeNumber(2000000));
        System.out.println((System.currentTimeMillis()-n)/1000);
    }

    public static long sumNPlacePrimeNumber(Integer limit) {
        long sum = 5;
        int i = 5;
        while (i <= limit) {
            if (isPrime(i)) {
                sum = sum + i;
            }
            i = i + 2;
            if(i <= limit && isPrime(i)){
                sum = sum + i;
            }
            i = i + 4;
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        // Corner case
        if (n <= 1) return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
