package sample;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
//        System.out.println(getSmallestNumber(numbers));
        System.out.println(run(20));
    }

    //My Solution
    public static Integer getSmallestNumber(List<Integer> numbers) {
        boolean flag = true;
        Integer size = numbers.size();
        Integer i = new Integer(size);
        while (flag) {
            flag = isModulusTrue(numbers, i);
            System.out.println(i);
            i = i + size;
        }
        return i - size;
    }

    public static boolean isModulusTrue(List<Integer> numbers, Integer temp) {
        boolean flag = false;
        for (int i = 0; i < numbers.size(); i++) {
            flag = temp % numbers.get(i).intValue() != 0;
            if (flag) {
                break;
            }
        }
        return flag;
    }

    //Optimized Code
    public static String run(Integer limit) {
        BigInteger allLcm = BigInteger.ONE;
        for (int i = 1; i <= limit; i++)
            allLcm = lcm(BigInteger.valueOf(i), allLcm);
        return allLcm.toString();
    }


    private static BigInteger lcm(BigInteger x, BigInteger y) {
        return x.divide(x.gcd(y)).multiply(y);
    }
}
