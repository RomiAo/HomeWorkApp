package geekBrains.ru.lesson6;


public class infoSeals {
    public static void main(String[] args) {
        double distanceRun = 200;
        double distanceSwim = 0;
        Cat cat = new Cat(distanceRun, distanceSwim);

        distanceRun = 500;
        distanceSwim = 10;
        Dog dog = new Dog(distanceRun, distanceSwim);

        System.out.println("Кошка может пробежать: " + cat.getAnimalDistanceRun());
        System.out.println("Собака может пробежать: " + dog.getAnimalDistanceRun());

        System.out.println("Кошка может проплыть: " + cat.getAnimalDistanceSwim());
        System.out.println("Собака может проплыть: " + dog.getAnimalDistanceSwim());
    }
}
