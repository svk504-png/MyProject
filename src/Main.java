//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;
import java.util.Random;

 public class Main {
    public static void main(String[] args) {

//создаем массив из трех строк
        String[] myFamily = {"Брат", "Сестра", "Ребенок"};
        Random random = new Random();

//Добавить генерацию случайного числа от 0 до 2 (включительно)
            int randomIndex = random.nextInt(3);
//выводим случайным образом строку
            System.out.println(myFamily[randomIndex]);
        }
    }