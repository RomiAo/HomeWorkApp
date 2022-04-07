package geekBrains.ru.lesson7;

import java.util.Scanner;

public class FeedCat {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int action;

        Cat[] Cats = new Cat[4];
        Cats[0] = new Cat("Барсик", 5, false);
        Cats[1] = new Cat("Мурзик", 25, false);
        Cats[2] = new Cat("Снежок", 10, false);
        Cats[3] = new Cat("Пушок", 30, false);

        Plate plate = new Plate(50);
        plate.info();
        for (Cat Cat : Cats) {
            if (!Cat.isFullness() && Cat.getAppetite() < plate.getFood()) {
                Cat.eat(plate);
                Cat.setFullness(true);
                System.out.println("Котик " + Cat.getName() + " покушал!");
            } else {
                System.out.println("Котик " + Cat.getName() + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм корма добавить еще в миску?");
        action = scanner.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}
