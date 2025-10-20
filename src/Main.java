//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //создать экземпляр класса
        Farm animalName1 = new Farm();
        animalName1.displayPublicInfo();
        //переопределить переменные
        animalName1.animalName = "Cow";
        animalName1.animalCount = 5;
        animalName1.displayPublicInfo();
    }
}
