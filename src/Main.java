public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ. Массивы Часть 1");
        task1();
        task2();
        task3();
        task4();
    }

    // Задача 1
    public static void task1() {
        System.out.println("Задача 1");

        int[] intArr = {1, 2, 3};
        double[] doubleArr = {1.57, 7.654, 9.986};
        long[] longtArr = {17, 27, 22};

        System.out.println("Массивы объявлены");
        System.out.println("--------");

    }

    // Задача 2
    public static void task2() {
        System.out.println("Задача 2");

        int[] intArr = {1, 2, 3};
        double[] doubleArr = {1.57, 7.654, 9.986};
        long[] longArr = {17, 27, 22};

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            if (i < intArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        for (int i = 0; i < doubleArr.length; i++) {
            System.out.print(doubleArr[i]);
            if(i < doubleArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        for (int i = 0; i < longArr.length; i++) {
            System.out.print(longArr[i]);
            if(i < longArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        System.out.println("--------");
    }

    // Задача 3
    public static void task3() {
        System.out.println("Задача 3");

        int[] intArr = {1, 2, 3};
        double[] doubleArr = {1.57, 7.654, 9.986};
        long[] longArr = {17, 27, 22};

        for (int i = intArr.length - 1; i >= 0; i--) {
            if (intArr.length - 1 > i) {
                System.out.print(", ");
            }
            System.out.print(intArr[i]);
        }
        System.out.println("");

        for (int i = doubleArr.length - 1; i >= 0; i--) {
            if (doubleArr.length - 1 > i) {
                System.out.print(", ");
            }
            System.out.print(doubleArr[i]);
        }
        System.out.println("");

        for (int i = longArr.length - 1; i >= 0; i--) {
            if (longArr.length - 1 > i) {
                System.out.print(", ");
            }
            System.out.print(longArr[i]);
        }
        System.out.println("");

        System.out.println("--------");
    }

    // Задача 4
    public static void task4() {
        System.out.println("Задача 4");

        int[] intArr = {1, 2, 3};

        for (int i = 0; i < intArr.length; i++) {

            if (i > 0) {
                intArr[i] = i + 1;
                System.out.print(", ");
            }

            if (intArr[i] % 2 != 0) {
                intArr[i] = intArr[i] + 1;
            }
            System.out.print(intArr[i]);
        }
        System.out.println("\n----------");
    }

}