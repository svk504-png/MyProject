//написать класс с тремя переменными
public class Farm {
    public String animalName = "Horse";
    public int animalCount = 12;
    static String farmName  = "Рога и копыта";

    //написать метод, где используется статическая переменная
    public static void displayInfo() {
        System.out.println("Название фермы: " + farmName);
    }
    public void displayPublicInfo(){
        System.out.println("Название фермы: " + farmName + ", Название животного: " + animalName + ", Количество: " + animalCount);
    }

}


