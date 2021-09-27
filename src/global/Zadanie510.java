package global;

import java.util.Scanner;

public class Zadanie510 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        int columns = scanner.nextInt();
        int[][] mass = new int[rows][columns];
        int num = 1;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                mass[i][j] = num++;
            }
        }
        System.out.println("Массив");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(" " + mass[i][j]);
            }
            System.out.println();
        }
    }
}
