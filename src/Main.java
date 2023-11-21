import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
//        ВНИМАНИЕ ВОПРОС! Я правильно понял, что в 1-й задаче не нужно было выводить в консоль результаты?
//        А вывести их во 2-й задаче?
        int[] test = new int[3];
        test[0] = 1;
        test[1] = 2;
        test[2] = 3;

        double[] test1 = {1.57, 7.654, 9.986};

        int[] test2 = new int[10];
        test2[0] = 55;
        test2[5] = 33;
        test2[9] = 1;


        System.out.println("Task#2:");
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]);
            if (i != test.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i]);
            if (i != test1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < test2.length; i++) {
            System.out.print(test2[i]);
            if (i != test2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nTask#3");
        for (int i = test.length - 1; i >= 0; i--) {
            System.out.print(test[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = test1.length - 1; i >= 0; i--) {
            System.out.print(test1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = test2.length - 1; i >= 0; i--) {
            System.out.print(test2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println("\nTask#4");
        for (int i = 0; i < test.length; i++) {
            if (test[i] % 2 != 0) {
                test[i]++;
            }
        }
        System.out.println(Arrays.toString(test));


    }

}