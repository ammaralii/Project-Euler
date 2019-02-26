package sample;

import java.math.BigInteger;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {
    //This is how most people done
    public static BigInteger getSumOFMultipleOfThreeAndFive(BigInteger limit){
        BigInteger total=BigInteger.ZERO;
        for (BigInteger i = BigInteger.ONE; i.compareTo(limit) < 0; i = i.add(BigInteger.ONE))
        {
            if (i.mod(BigInteger.valueOf(3)).compareTo(BigInteger.ZERO) == 0 || i.mod(BigInteger.valueOf(5)).compareTo(BigInteger.ZERO) == 0)
            {
                total = total.add(i);
            }
        }
        return total;
    }

    public static int getSolutionUsingStreams(int limit){
        List<Integer> range = IntStream.rangeClosed(1, 999)
                .boxed().collect(Collectors.toList());

        return range.stream().filter(i -> i%3 == 0 || i%5==0).mapToInt(i -> i.intValue()).sum();
    }

    //This is solution which must be used
    public static BigInteger sumDivisibleBy(BigInteger number, BigInteger target){
        BigInteger temp = target.subtract(BigInteger.ONE).divide(number);
        return number.multiply(temp.multiply(temp.add(BigInteger.valueOf(1)))).divide(BigInteger.valueOf(2));
    }

    public static void main(String[] args) {
        BigInteger limit = new BigInteger("1000");
        long l = System.currentTimeMillis();
        System.out.println(Problem1.getSumOFMultipleOfThreeAndFive(limit));
        long l1 = System.currentTimeMillis();
        System.out.println(Problem1.sumDivisibleBy(BigInteger.valueOf(3),limit).add(Problem1.sumDivisibleBy(BigInteger.valueOf(5),limit)).subtract(Problem1.sumDivisibleBy(BigInteger.valueOf(15),limit)));
        long l2 = System.currentTimeMillis();
        System.out.println("For loop time:"+(l1-l)/1000.0);
        System.out.println("Function time:"+(l2-l1)/1000.0);
    }
}
