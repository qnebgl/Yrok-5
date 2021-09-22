package global;

import java.util.Scanner;

public class Zadanie58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int height = scanner.nextInt();
        System.out.println("Введите количество столбцов : ");
        int length = scanner.nextInt();
        int mass[][] = new int[height][length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                mass[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Введенные элементы массива: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(" " + mass[i][j]);
            }
            System.out.println();
        }
    }
}
