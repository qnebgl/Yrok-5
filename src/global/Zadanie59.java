package global;

public class Zadanie59 {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Сумма аргументов: " + sum);
    }
}