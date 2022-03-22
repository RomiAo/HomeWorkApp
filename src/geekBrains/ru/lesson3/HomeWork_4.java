package geekBrains.ru.lesson3;

import com.sun.org.apache.bcel.internal.generic.I2F;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_4 {

    public static char[][] MAP;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true){
            humanTurn();
            printMap();

            if (isWin(DOT_X)) {
                System.out.println("Человек победил!");
                break;
            }
            if (isMapFill()) {
                System.out.println("Ничья");
                break;
            }
            computerTurn();
            printMap();

            if (isWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isMapFill()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static Scanner scanner = new Scanner(System.in);
    public static void humanTurn(){
        int x;
        int y;
        do {
            System.out.println("Введите кординаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE){
                System.out.println("Данные введены некорректно");
            } else if (MAP[x][y] != DOT_EMPTY){
                System.out.println("Клетка уже занята");
            } else {
                break;
            }
        } while (true);
            MAP[x][y] = DOT_X;
    }

    public static boolean isWin(char symbol) {
        int hor, ver;
        int dMain, dReverse;
        for (int i = 0; i < SIZE; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == symbol) {
                    hor++;
                } else if (MAP[i][j] != symbol && hor < DOTS_TO_WIN) {
                    hor = 0;
                }
                if (MAP[j][i] == symbol) {
                    ver++;
                } else if (MAP[j][i] != symbol && ver < DOTS_TO_WIN) {
                    ver = 0;
                }
            }
            if (hor >= DOTS_TO_WIN || ver >= DOTS_TO_WIN) {
                System.out.println("По горизонтали или вертикали " + hor + " " + ver);
                return true;
            }
        }

        for (int j = 0; j < SIZE; j++) {
            dMain = 0;
            for (int i = 0; i < SIZE; i++) {
                int a = j + i;
                if (a < SIZE) {
                    if (MAP[i][a] == symbol) {
                        dMain++;
                    } else if (MAP[i][a] != symbol && dMain < DOTS_TO_WIN) {
                        dMain = 0;
                    }
                }
                if (dMain >= DOTS_TO_WIN) {
                    System.out.println("По главной диагонали от центральной оси вправо " + dMain);
                    return true;
                }
            }
        }

        for (int j = 1; j < SIZE; j++) {
            dMain = 0;
            for (int i = 0; i < SIZE; i++) {
                int a = j + i;
                if (a < SIZE) {
                    if (MAP[a][i] == symbol) {
                        dMain++;
                    } else if (MAP[a][i] != symbol && dMain < DOTS_TO_WIN) {
                        dMain = 0;
                    }
                }
                if (dMain >= DOTS_TO_WIN) {
                    System.out.println("По главной диагонали от центральной оси вниз " + dMain);
                    return true;
                }
            }
        }

        for (int j = 0; j < SIZE; j++) {
            dReverse = 0;
            for (int i = 0; i < SIZE; i++) {
                int a = (SIZE - 1) - i;
                int l = j + i;
                if (a >= 0 && l < SIZE) {
                    if (MAP[l][a] == symbol) {
                        dReverse++;
                    } else if (MAP[l][a] != symbol && dReverse < DOTS_TO_WIN) {
                        dReverse = 0;
                    }
                }
                if (dReverse >= DOTS_TO_WIN) {
                    System.out.println("По главной диагонали от центральной оси вниз " + dReverse);
                    return true;
                }
            }
        }

        for (int j = 1; j < SIZE; j++) {
            dReverse = 0;
            for (int i = 0; i < SIZE; i++) {
                int a = (SIZE - 1) - j - i;
                if (a >= 0) {
                    if (MAP[i][a] == symbol) {
                        dReverse++;
                    } else if (MAP[i][a] != symbol && dReverse < DOTS_TO_WIN) {
                        dReverse = 0;
                    }
                }
                if (dReverse >= DOTS_TO_WIN) {
                    System.out.println("По главной диагонали от центральной оси влево " + dReverse);
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isMapFill() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void computerTurn() {
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (MAP[x][y] != DOT_EMPTY);
        System.out.println("Компьютер походил в ячейку " + (x + 1) + " " + (y + 1));
        MAP[x][y] = DOT_O;
    }

    public static void initMap(){
        MAP = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap(){
        for (int i = 0; i <= SIZE; i++) {
            if (i == 0){
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
