package geekBrains.ru.lesson6;

public class Animal implements AnimalInterface {
    private double animalDistanceRun, animalDistanceSwim;

    Animal(double animalDistanceRun, double animalDistanceSwim){
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceSwim = animalDistanceSwim;
    }

    @Override
    public boolean run(double value) {
        return animalDistanceRun > value;
    }

    @Override
    public boolean swim(double value) {
        return animalDistanceSwim > value;
    }

    public double getAnimalDistanceRun() {
        return animalDistanceRun;
    }

    public double getAnimalDistanceSwim() {
        return animalDistanceSwim;
    }
}
