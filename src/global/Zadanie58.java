package global;

import java.util.Scanner;

public class Zadanie58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.println("Введите количество столбцов : ");
        int columns = scanner.nextInt();
        int mass[][] = new int[rows][columns];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mass[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Введенные элементы массива: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(" " + mass[i][j]);
            }
            System.out.println();
        }
    }
}
