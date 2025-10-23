//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //создаем объект Car
        Car car = new Car("Nissan", 2025);

        //создать несколько экземпляров класса Car
        Car car1 = new Car("BMV", 2016);
        Car car2 = new Car("Lada Vesta", 2020);
        Car car3 = new Car("Opel", 2017);
        //переопределить переменные
        car2.model = "Lada Priora";
        car2.year = 2021;
        //вывести результат метода BeBe

        car2.Bebe();
    }
}
