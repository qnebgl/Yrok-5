package global;

public class Logic {
    public static void main(String[] args) {
        boolean yes = true ;
        boolean no = false ;
        System.out.println("Результат выражения yes и yes :" + (yes&&yes ));
        System.out.println("Результат выражения yes и no :" + (yes&&no ));
        System.out.println("Результат выражения yes ИЛИ yes :" + (yes||yes ));
        System.out.println("Результат выражения yes ИЛИ no :" + (yes||no));
        System.out.println("Результат выражения no ИЛИ no :" + (no||no ));
        System.out.println("Первоначальное значение yes  :" + yes);
        System.out.println("Инвертированная переменая yes  :" + !yes);
    }

}
