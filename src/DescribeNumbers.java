/**
 * public class DescribeNumbers  - Converts from string to an array of numbers and finds the minimum,
 * maximum, and average.
 */
public class DescribeNumbers {
    /**
     * @param numbers - Convert from string numbers to an array of int numbers.
     * By switching with index on all the string organs
     * and converting to an array of scissors and
     * placing in its place suitable for the index.
     * @return - Returns an array of numbers.
     */
    public static int[] stringsToInts(String[] numbers) {
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)  {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        return arr;
    }

    /**
     * @param numbers - A function that finds the minimum member by defining the first member minimum in the array.
     * and testing for each pair of members in the array,
     * if the second is smaller we will update the minimum to be the new minimum.
     * @return - return the minimum organ of the array.
     */
    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    /**
     * @param numbers -A function that finds the maximum member by setting the maximum of the first member in the array,
     * and checking for each pair of members in the array,
     * if the second is larger we will update the maximum so that it is the new maximum.
     * @return - return the maximum organ of the array.
     */
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * @param numbers -A function that calculates the average of the array by calculating the sum of the array organs
     * and dividing by the number of array members.
     * By definition of arithmetic mean.
     *  @return -return the average.
     */
    public static float avg(int[] numbers) {
        float sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    /**
     * @param args -getting arguments into the main function
     *  and sends data to auxiliary functions and at the end prints the results.
     */
    public static void main(String[] args) {
        int[] numbers = stringsToInts(args);
        System.out.println("min: " + min(numbers));
        System.out.println("max: " + max(numbers));
        System.out.println("avg: " + avg(numbers));
    }
}
