public class Car {
    //создаем поля
    public String model;
    public int year;

    //создаем конструктор
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    //добавим метод BeBe
    public void Bebe() {
        System.out.println("Машинка марки " + model + " годом выпуска:" + year + " издает сигнал: Би-Би");
    }

    //добавим геттер и сеттер
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}