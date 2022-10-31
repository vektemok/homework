import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int num = sc.nextInt();
        int[] myArray = new int[num];
        int sum = 0;
        int min = num;
         // Заложенное значение из массива равняется нулю почему?
        // Зачем отнимать один от значения вложенного в массив?
        System.out.println("Значение в нутри массива до вхождения в цикл " + Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = ran.nextInt(100);
        }

        int max = myArray[0];

        for (int i = 0; i < myArray.length; i++) {


            if (myArray[i] < min) {
                // как думаешь почему тут не находится минимальное зночение
                min = myArray[i];
            }
            sum = sum + myArray[i];

//            System.out.println(num);/
            // В цикле нет массива вообще ( Массив не участвует в вычеслении программы и просто занимает память)
        }

        System.out.println("Значения в нутри массива после цикла " + Arrays.toString(myArray));
        System.out.println("Сумма чисел " + sum);
        System.out.println("Среднее арифмитическое " + (double) sum / myArray.length);
        System.out.println("Минимальное значение " + min);
        System.out.println("колличество чисел в массиве " + myArray.length);

    }
}
