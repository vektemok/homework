import java.sql.SQLOutput;
import java.util.Scanner;

public class fg {
    public static void main(String[] args) {
        /**
         // написать программу которая будет принимать от пользователя значение имя пороль и почта. программа
         должна принимать
         значение и выввести если этот пользователь есть
         // то программа должна вывести значение поздровляю вы вошлиБ если пороль будет неверен или имя вывести у вас нет доступа
         создать две переменные типа стринг и сохранить имя пользователя и пороль для сравнения
         */
        Scanner sc = new Scanner(System.in);
        String login = "Егор";
        String line12 = "Махачкала";
        String line13 = "12345";

        System.out.println("Введите имя ");
        String line = sc.nextLine();
        System.out.println("Введите логин");
        String line2 = sc.nextLine();
        System.out.println("Введите пороль");
        String line3 = sc.nextLine();

        if (line.equals(login) && line12.equals(line2) && line13.equals(line3)) {
            System.out.println("Вы вошли в систему");
        }else {
            System.out.println("ИДи нахуй");
        }

    }
}

