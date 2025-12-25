package practice_8;

import java.util.Scanner;

public class practice_8_Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок для перевірки на паліндром:");
        String originalText = scanner.nextLine();

        String cleanText = originalText.replaceAll("\\s+", "").toLowerCase();
        String reversedText = new StringBuilder(cleanText).reverse().toString();

        if (cleanText.equals(reversedText)) {
            System.out.println("Цей рядок є паліндромом.");
        } else {
            System.out.println("Цей рядок НЕ є паліндромом.");
        }
    }
}
