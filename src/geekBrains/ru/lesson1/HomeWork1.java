package geekBrains.ru.lesson1;

public class HomeWork1 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        PrintColor();
        compareNumber();
    }
    // Ввызывает в столбец 3 слова
    public static void printThreeWords(){
        System.out.println("----------Первое задание----------");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    // Суммирует значения
    public static void checkSumSign(){
        System.out.println("----------Второе задание----------");
        int a = 10;
        int b = 5;
        int sum = a + b;

        if (sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
    // Определяет цвет по цифре
    public static void PrintColor(){
        System.out.println("----------Третье задание----------");
        int value = 0;

        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else if (value > 100){
            System.out.println("Зеленый");
        } else {
            System.out.println("Не верное значение");
        }


    }
    // Больше или равно, Меньше ил равно
    public static void compareNumber(){
        System.out.println("----------Четвертое задание----------");
        int a = 15;
        int b = 12;

        if(a >= b){
            System.out.println("а больше или равно b");
        } else {
            System.out.println("a меньше или равно b");
        }
    }
}



