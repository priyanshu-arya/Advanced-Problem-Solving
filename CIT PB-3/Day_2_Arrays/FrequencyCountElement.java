package Day_2_Arrays;

public class FrequencyCountElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 10, 40};
        int target = 10;
        int count = 0; // Variable to store the frequency count
        // Traverse the array using a for loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++; // Increment count if the element matches the target
            }
        }
        System.out.println("Frequency of element " + target + " is: " + count);        
    }
}
