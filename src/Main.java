//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Создайте абстрактный класс Shape с абстрактным методом draw().
         abstract class Shape {
            public abstract void draw();
        }

        // Создайте подклассы Circle и Rectangle, которые реализуют метод draw().
         class Circle extends Shape {
            @Override
            public void draw() {
                System.out.println("Нарисовать круг");
            }
        }
         class Rectangle extends Shape {
            @Override
            public void draw() {
                System.out.println("Нарисовать прямоугольник");
            }
        }
        // В методе draw() выведите сообщение о том, что фигура рисуется.
        Shape Circle1 = new Circle();
        Shape Rectangle1 = new Rectangle();
        Circle1.draw();
        Rectangle1.draw();
    }
}


