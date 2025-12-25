package practice_8;

import java.util.Scanner;

public class practice_8_Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть речення:");
        String input = scanner.nextLine();

        String[] words = input.trim().split("[\\s,.]+");

        if (words.length == 0 || input.isEmpty()) {
            System.out.println("Текст не введено.");
            return;
        }

        String minWord = words[0];
        String maxWord = words[0];

        for (String word : words) {
            if (word.length() < minWord.length()) {
                minWord = word;
            }
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }

        System.out.println("Найменше слово: '" + minWord + "' (довжина: " + minWord.length() + ")");
        System.out.println("Найдовше слово: '" + maxWord + "' (довжина: " + maxWord.length() + ")");
    }
}