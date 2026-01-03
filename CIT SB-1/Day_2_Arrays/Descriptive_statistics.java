package Day_2_Arrays;

public class Descriptive_statistics {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        double mean;
        double median;
        int min = numbers[0];
        int max = numbers[0];

        // Calculate sum, min, and max
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Calculate mean
        mean = (double) sum / numbers.length;

        // Calculate median
        // First, we need to sort the array
        java.util.Arrays.sort(numbers);
        if (numbers.length % 2 == 0) {
            median = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        } else {
            median = numbers[numbers.length / 2];
        }

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
