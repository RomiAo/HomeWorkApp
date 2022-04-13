package geekBrains.ru.lesson9;

public class Robot implements Participant {

     private final String name;
     private boolean onDistance;
     private final int maxRunDistance;
     private final int maxJumpDistance;
     private final int maxSwimDistance;

    public Robot(String name, int maxRunDistance, int maxJumpDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал!");
        } else {
            System.out.println(name + " не смог пробежать!");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpDistance) {
            System.out.println(name + " успешно препрыгнул стену!");
        } else {
            System.out.println(name + " не смог перепрыгнуть стену!");
            onDistance = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать!");
            onDistance = false;
        } else if (distance <= maxSwimDistance) {
            System.out.println(name + " успешно переплыл!");
        } else {
            System.out.println(name + " не смог переплыть!");
            onDistance = false;
        }
    }

    @Override
    public String toString() {
        return "Робот " + name + " : " + (isOnDistance() ? "на дистанции" : "сошел с дистанции");
    }
}
