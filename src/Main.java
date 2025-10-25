//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Создать массив из 3-х строк (привет, ПОКА, гипербола)
        String[] words = {"привет", "ПОКА", "гипербола"};

// Вывести в консоль первую строку из массива
        String firstWords = words[0];
        String secondWords = words[1];
        String thirdWords = words[2];
// Вывести в консоль первую строку из массива в верхнем регистре
        String upperCaseFirstWords = firstWords.toUpperCase();
        System.out.println(upperCaseFirstWords);

// Вывести вторую строку из массива в нижнем регистре
        String lowerCaseSecondWords = secondWords.toLowerCase();
        System.out.println(lowerCaseSecondWords);

        // Вывести третью строку, в которой вторая буква будет "О" и между второй и третьей буквой поставить «пробел»
        System.out.println(thirdWords.replace("и", "О "));
    }
}

