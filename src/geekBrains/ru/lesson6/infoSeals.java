package geekBrains.ru.lesson6;


public class infoSeals {
    public static void main(String[] args) {
        Animal[] participants = prepareParticipants();

        for (Animal participant : participants) {
            participant.run(300);
            participant.swim(20);
        }
    }

    private static Animal[] prepareParticipants() {
        return new Animal[] {
                new Dog(400,10),
                new Dog(150,5),
                new Cat(200,2),
                new Cat(500,10),
        };
    }
}
