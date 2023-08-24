package Backtracking;

import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        // Remove punctuation and convert to lowercase
        sentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = sentence.split(" ");
        String[] uniqueWords = new String[words.length];
        int[] wordFrequency = new int[words.length];
        int uniqueWordCount = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                int index = -1;
                for (int i = 0; i < uniqueWordCount; i++) {
                    if (uniqueWords[i].equals(word)) {
                        index = i;
                        break;
                    }
                }

                if (index != -1) {
                    wordFrequency[index]++;
                } else {
                    uniqueWords[uniqueWordCount] = word;
                    wordFrequency[uniqueWordCount] = 1;
                    uniqueWordCount++;
                }
            }
        }

        System.out.println("Word Frequency:");
        for (int i = 0; i < uniqueWordCount; i++) {
            System.out.println(uniqueWords[i] + ": " + wordFrequency[i]);
        }
    }
}

