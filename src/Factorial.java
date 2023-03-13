/**
 * factorial calculates a factorial.
 */
public class Factorial {

    /**
     *@param n - A function that calculates a factorial by multiplying the number (n)
     * by the previous one and looping for and Using iterative algorithm.
     * @return calculates n of factorial.
     */
    public static long factorialIter(long n) {
        for (long i = n - 1; i > 0; i--) {
            n = n * i;
        }
        return n;
    }

    /**
     * @param n - A function that calculates a factorial by multiplying
     * the number (n) by the previous one
     * and looping for and Using Recusia algorithm.
     * @return n- calculates n of factorial.
     */

    public static long factorialRecursive(long n) {
        return n == 1 ? n : factorialRecursive(n - 1) * n;
    }

    /**
     *  @param args -getting arguments into the main function that performs the sending
     * to auxiliary functions and in addition prints.
     */
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.println("recursive: " + factorialRecursive(n));
        System.out.println("iterative: " + factorialIter(n));
    }
}


