import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Come up with a password: "); //Предложение ввести пароль
        Scanner sc = new Scanner(System.in); //Инициализация объекта класса сканнер для ввода информации с консоли
        for(;;){ //бесконечный цикл
            String password = sc.nextLine(); // Ввод строки из консоли
            if (password.length()>7 && //Проверка длины пароля
                    password.matches("[A-Za-z0-9_]+") && //Пр-ка на отсутствие недопустимых символов
                    password.matches(".*[A-Z].*") && // Пр-ки на вхождение хотя бы одной заглавной и строчной букв и цифры
                    password.matches(".*[a-z].*") &&
                    password.matches(".*[0-9].*"))
            {
                System.out.println("It's safe password!\nHave a nice day:)"); //Вывод сообщения об успехе
                break; //выход из цикла
            }else{
                System.out.println( //Вывод сообщения о неудаче с сообщением из-за чего пароль может не приниматься
                    "It's not safe password! Safe one sholuld:\n" +
                    "~consist from more than 7 symbols\n" +
                    "~only consists symbols from english alphabet, arabic numbers and '_' symbol\n" +
                            "~have at least one number, capital and general letter\n" +
                            "\nPlease come up other password: ");
            }
        }
    }
}