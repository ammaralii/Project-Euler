package sample;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p>
 * What is the 10 001st prime number?
 */
public class Problem7 {
    public static void main(String[] args) {
        System.out.println(nPlacePrimeNumber(10001));
    }

    public static Integer nPlacePrimeNumber(Integer nPlace) {
        Integer i = 1;
        Integer primeNumber = 1;
        while (nPlace >= i) {
            System.out.println(i);
            primeNumber = primeNumber + 1;
            if (isPrime(primeNumber)) {
                i = i + 1;
            }
        }
        return primeNumber;
    }

    public static boolean isPrime(Integer n) {
        // Corner case
        if (n <= 1) return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
