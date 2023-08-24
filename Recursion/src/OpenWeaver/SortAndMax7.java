package OpenWeaver;

import java.util.ArrayList;
import java.util.Collections;

public class SortAndMax7{

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 10 Integers to the ArrayList
        numbers.add(23);
        numbers.add(45);
        numbers.add(12);
        numbers.add(67);
        numbers.add(34);
        numbers.add(89);
        numbers.add(56);
        numbers.add(32);
        numbers.add(78);
        numbers.add(99);

        // Sort the ArrayList in descending order
        Collections.sort(numbers, Collections.reverseOrder());

        // Find the maximum value after sorting
        int maxValue = numbers.get(0);

        System.out.println("Sorted Numbers in Descending Order:");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Maximum Value: " + maxValue);
    }
}
