public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 7;
        int b = -6;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = -20;
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

    static void compareNumbers() {
        int a = 7;
        int b = -6;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
