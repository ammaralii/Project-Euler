package sample;

/**
 * The sum of the squares of the first ten natural numbers is,
 * <p>
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * <p>
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {
    public static void main(String[] args) {
        System.out.println(getDifferenceOfSquareOfSumAndSumOfSquare(100));
    }

    public static Integer getDifferenceOfSquareOfSumAndSumOfSquare(Integer limit) {
        return squareOfSum(limit) - sumOfSquares(limit);
    }

    public static Integer sumOfSquares(Integer limit) {
        Integer sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum = sum + (i * i);
        }
        return sum;
    }

    public static Integer squareOfSum(Integer limit) {
        Integer sum = (limit * (limit + 1)) / 2;
        return sum * sum;
    }
}
