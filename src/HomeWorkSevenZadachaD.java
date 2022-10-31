import java.util.Random;

public class HomeWorkSevenZadachaD {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = ran.nextInt(101);
        }
        int summ = 0;
        for (int i = 0; i < num.length; i++) {
            summ = summ + num.length;

        }
    }
}
