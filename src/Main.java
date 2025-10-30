//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Создайте класс Employee с полями name и salary. Добавьте метод work(), который выводит сообщение о работе сотрудника.

        class Employee {
            protected String name;
            protected int salary;

            public Employee(String name, int salary) {
                this.name = name;
                this.salary = salary;
            }

            public void work() {
                System.out.println(name + " работает аналитиком c окладом:" + salary + " руб.");
            }
        }
        //Создайте подклассы Manager и Developer, которые наследуют от Employee. Добавьте метод work(), который выводит сообщение о работе сотрудника.

        class Manager extends Employee {
            public Manager(String name, int salary) {
                super(name, salary);
            }

            @Override
            public void work() {
                System.out.println(name + " руководит командой аналитиков и часто пьет кофе и получает зарплату:" + salary + " руб.");
            }
        }
        class Developer extends Employee {
            public Developer(String name, int salary) {
                super(name, salary);
            }

            @Override
            public void work() {
                System.out.println(name + " очень редко общается с командой аналитиков и поэтому часто ошибается при написании кода, но получает зарплату в размере:" + salary + " руб.");
            }
        }
        {
                Employee employee = new Employee("Елена", 94700);
                Manager manager = new Manager("Андрей", 135687);
                Developer developer = new Developer("Артур", 142523);

                employee.work();
                manager.work();
                developer.work();
            }
        }
    }

