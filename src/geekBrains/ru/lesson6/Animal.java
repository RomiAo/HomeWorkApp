package geekBrains.ru.lesson6;

abstract class Animal {
    protected int maxDistanceRun = 0;
    protected int maxDistanceSwim = 0;

    public Animal(int maxDistanceRun, int maxDistanceSwim) {
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
    }

    public abstract boolean run(int distance);
    public abstract boolean swim(int distance);

}
