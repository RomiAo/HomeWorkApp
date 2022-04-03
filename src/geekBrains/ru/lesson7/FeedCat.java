package geekBrains.ru.lesson7;

import java.util.Scanner;

public class FeedCat {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int action;

        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Барсик", 5, false);
        allCats[1] = new Cat("Мурзик", 25, false);
        allCats[2] = new Cat("Снежок", 10, false);
        allCats[3] = new Cat("Пушок", 30, false);

        Plate plate = new Plate(50);
        plate.info();
        for (Cat allCat : allCats) {
            if (!allCat.isFullness() && allCat.getAppetite() < plate.getFood()) {
                allCat.eat(plate);
                allCat.fullness = true;
                System.out.println("Котик " + allCat.getName() + " покушал!");
            } else {
                System.out.println("Котик " + allCat.getName() + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм корма добавить еще в миску?");
        action = scanner.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}
