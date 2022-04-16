package geekBrains.ru.lesson9;

public class Cross extends Obstacle {

    private final int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant animal) {
        animal.run(length);
    }
}
