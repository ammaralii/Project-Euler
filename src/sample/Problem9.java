package sample;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9 {
    public static void main(String[] args) {
        System.out.println(findTriplet(1000));
    }

    private static int findTriplet(int sum) {
        for (int a = 1; a <= sum / 3; a++) {
            for (int b = a + 1; b <= sum / 2; b++) {
                int c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                    System.out.println("a: " + a + ", b:" + b + ", c:" + c);
                    return a*b*c;
                }
            }
        }
        return 0;
    }
}
