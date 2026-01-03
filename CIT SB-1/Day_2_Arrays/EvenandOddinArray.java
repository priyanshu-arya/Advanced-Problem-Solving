package Day_2_Arrays;

public class EvenandOddinArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 41, 50};

        // Traverse the array using a for loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("Element at index " + i + " is Even: " + numbers[i]);
            } else {
                System.out.println("Element at index " + i + " is Odd: " + numbers[i]);
            }
        }
    }  
}
