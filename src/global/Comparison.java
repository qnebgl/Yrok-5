package global;

public class Comparison {
    public static void main(String[] args) {
        String txt = "Fantastic";
        String lang = "Java";
        boolean state = txt == lang; // GПрисваиваем результат проверки
        System.out.println("Проверка на равенство: " + state);
        state = txt != lang; // Присваиваем результат
        System.out.println("Проверка строк на неравество: " + state);
        int dozen = 12;
        int score = 20;
        state = dozen > score; // Присваиваем результат
        System.out.println("Проверка на больше:" + state);
        state = dozen < score; //Присваиваем результат
        System.out.println("Проверка на меньшк: " + state);

    }
}
