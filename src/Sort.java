/**
 * @ Sort- Sorting a string array into an array of numbers,
 * and arranging in ascending and descending order.
 */
public class Sort {
    /**
     * algorithm Bubble Sort for ascending order.
     * @param arr - array of numbers.
     */

    public static void bubbleSortasc(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * algorithm Bubble Sort for descending order.
     *  @param arr - array of numbers.
     */
    public static void bubbleSortdesc(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * @param numbers - Convert from string numbers to an array of int numbers.
     * By switching with index on all the string organs
     * and converting to an array of scissors and
     * placing in its place suitable for the index.
     * @return - array of numbers..
     */
    public static int[] stringsToInts(String[] numbers) {
        /*
         *  I was taken off the size 1 because the first notepad is downloaded because it's a straight letter
         **/
        int[] arr = new int[numbers.length - 1];
        for (int i = 1; i < numbers.length; i++) {
            /*
            Skipping the first index because it is a string and not numbers.
            */
            arr[i - 1] = Integer.parseInt(numbers[i]);
        }
        return arr;
    }

    /**
     *@param arr - Function for printing an array of numbers.
     */
    public static void printarr(int[] arr) {
        for (int j : arr) {
            System.out.print(+j);
            System.out.print(" ");
        }
    }

    /**
     * @param args - The main function that includes division into different modes of arrays.
     */
    public static void main(String[] args) {
        int[] arr = stringsToInts(args);
        String s = args[0];
        if (s.equals("asc")) {
            bubbleSortasc(arr);
        }

        if (s.equals("desc")) {
            bubbleSortdesc(arr);
        }
        printarr(arr);
    }
}
