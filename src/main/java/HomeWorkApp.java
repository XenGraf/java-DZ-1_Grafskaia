import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int value = in.nextInt();
        checkSumSign(a,b);
        printColor(value);
        compareNumbers(a,b);
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign(int a, int b) {
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor(int value) {
        if (value > 100) {
            System.out.println("Зеленый");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value <= 0) {
            System.out.println("Красный");
        }
    }

    static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
