package Day_2_Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 45, 99};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find the largest and second largest elements
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != firstLargest) {
                secondLargest = numbers[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
