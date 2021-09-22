package global;

public class Zadanie59 {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            int var = Integer.parseInt(arg);
            sum += var;
        }
        System.out.println("Сумма аргументов: " + sum);
    }
}
