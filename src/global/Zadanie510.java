package global;

import java.util.Scanner;

public class Zadanie510 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int height = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        int length = scanner.nextInt();
        int[][] mass = new int[height][length];
        int num = 1;
        for (int j = 0; j < length; j++) {
            for (int i = 0; i < height; i++) {
                mass[i][j] = num++;
            }
        }
        System.out.println("Массив");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(" " + mass[i][j]);
            }
            System.out.println();
        }
    }
}
