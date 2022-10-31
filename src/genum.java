import java.util.Scanner;

public class genum {
    public static void main(String[] args) {
        /**
         * нужно ввести год рождения, программа должно вывести сколько человеку лет и высокосный ли год он родился.
         * алгоритм понимания является ли год высокоссным:
         *  если год не делится на 4 значит он обычный1
         * 2 иначе надо проверит не делится ли год на 100
         * 3 если не делится это не столетие
         * и можно сделать вывод что выссокосный
         * 4если делится на 100 значит это столетие  и следует проверить его на делимость  400
         * если год делится на 400 то он высокосный
         * 6 иначе год обычный
         *
         * пример входного параметра 1990 пример выходног парамметра 32 года год не высокоссный
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш год рождения ");
        int age = sc.nextInt();
        int year = 2022;
        int summ = 0;
        if (year >= age)
            summ = year - age;

        {

            if (summ == 1) {
                System.out.println(summ + " Год");
            } else if (summ < 4) {
                System.out.println(summ + " Года");
            } else if (summ <= 5) ;
            System.out.println(summ + " Лет");
        }
        if (summ % 4 == 0) {
            System.out.println("Год обычный");
        } else if (summ % 100 == 0) {
            summ = summ;

        }
        if (summ % 400 == 0){
            System.out.println("год высокосный");
        }else {
            System.out.println("год обычный");
        }
    }
}





