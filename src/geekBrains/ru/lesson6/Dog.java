package geekBrains.ru.lesson6;

class Dog extends Animal {

    public Dog(int maxDistanceRun, int maxDistanceSwim) {
        super(maxDistanceRun, maxDistanceSwim);
    }

    @Override
    public boolean run(int distance) {
        if (distance < this.maxDistanceRun){
            System.out.printf("Собака пробежала %d метров%n", distance);
            return true;
        }
        System.out.println("собака не смогла пробежать");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (distance < this.maxDistanceSwim){
            System.out.printf("Собака проплыла %d метров%n", distance);
            return true;
        }
        System.out.println("собака не смогла проплыть");
        return false;
    }
}
