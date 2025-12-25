package practice_8;

import java.util.Scanner;

public class practice_8_Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок для перевертання:");
        String input = scanner.nextLine();

        String result = new StringBuilder(input).reverse().toString();

        System.out.println("Інвертований рядок: " + result);
    }
}
