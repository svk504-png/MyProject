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

        //Создать класс с данными, который имеет вложенный класс Enum, в котором указано количество струн

        class Instrument {

            // Вложенный Enum, в котором указано количество струн
            enum StringType {
                GUITAR(6),
                PIANO(0);

                private final int numberOfStrings;

                StringType(int numberOfStrings) {
                    this.numberOfStrings = numberOfStrings;
                }

                public int getNumberOfStrings() {
                    return numberOfStrings;
                }
            }
        }

        //Создать интерфейс Playable с методом play(), который принимает количество струн
        interface Playable {
            void play(int numberOfStrings);
        }
        //Реализуйте этот интерфейс в классах Guitar и Piano.
        class Guitar extends Instrument implements Playable {
            @Override
            public void play(int numberOfStrings) {
                System.out.println("При игре на гитаре используется " + numberOfStrings + " струн");
            }
        }

        class Piano extends Instrument implements Playable {
            @Override
            public void play(int numberOfStrings) {
                System.out.println("При игре на пианино используются клавиши, потому что у пианино " + numberOfStrings + " струн");
            }
        }
        {
            Guitar guitar = new Guitar();
            Piano piano = new Piano();

            // Количество струн должно передаваться из вложенного класса Enum
            guitar.play(Instrument.StringType.GUITAR.getNumberOfStrings());
            piano.play(Instrument.StringType.PIANO.getNumberOfStrings());
        }
    }
}