package geekBrains.ru.lesson6;

public class Cat extends Animal {

    public Cat(int maxDistanceRun, int maxDistanceSwim) {
        super(maxDistanceRun, maxDistanceSwim);
    }

    @Override
    public boolean run(int distance) {
        if (distance < this.maxDistanceRun){
            System.out.printf("Кот пробежал %d метров%n", distance);
            return true;
        }
        System.out.println("Кот не смог пробежать");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println("Кот не смогла проплыть");
        return false;
    }
}
