package geekBrains.ru.lesson1;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("----------Первое задание----------");
        System.out.println(withIn10And20(10,10)); // Выполнение первого задания
        System.out.println("----------Второе задание----------");
        positiveNegativeNumber(-7); // Выполнение второго задания
        System.out.println("----------Третье задание----------");
        System.out.println(Integer(-7));// Выполнение третьего задания
        System.out.println("----------Четвертое задание----------");
        printWordNTimes("Times",4);// Выполнение четвертого задания
        System.out.println("----------Пятое задание----------");
        System.out.println(leapYear(2020));// Выполнение пятого задания
    }
    // Первое задание кажется правильно работает но есть сомнения
    public static boolean withIn10And20(int x1,int x2){
        int sum = x1 + x2;
        return sum > 10 && sum < 20;

    }

    public static void positiveNegativeNumber(int a){
        if (a >= 0) {
            System.out.println("Число " + a + " Положительно ");
        }
        else {
            System.out.println("Число " + a + " Отрицательно");
        }
    }

    // Воспользовался рекомендацией Intellij
    public static boolean Integer(int a){
        return a >= 0; // if (a < 0) return false, return true.
    }

    public static void printWordNTimes (String word, int times){
        for (int i = 0; i < times; i++){
            System.out.println(word);
        }
    }

    public static boolean leapYear(int year){
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " Високосный год"); return true;
        } else {
            System.out.println(year + " Невисокосный год"); return false;
        }
    }
}


