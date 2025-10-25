//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float initialSum = scanner.nextFloat();

        System.out.println("Введите срок вклада в месяцах: ");
        int number = scanner.nextInt();
        float totalSum = initialSum;

        final float PROCENT = 0.07f;
        int currentNumber = 0;
        while (currentNumber < number) {
            totalSum = totalSum * (1 + PROCENT);
            currentNumber++;
        }
        System.out.println("После " + number + " месяцев сумма вклада составит: " + totalSum + " руб.");
        scanner.close();
    }
}

