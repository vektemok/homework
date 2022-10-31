import java.util.Random;
import java.util.Scanner;

public class HomeWorkSevenZadachaC {
    public static void main(String[] args) {
        int box1 = 15;
        int box2 = 17;
        int box3 = 18;
        int box = 185;
        for (int i = 0; i < box / box3; i++) {
            for (int j = 0; j < box / box2; j++) {
                for (int k = 0; k < box / box1; k++) {
                    int set = (i * box3) + (j * box2) + (k * box1);
                    if (set == box) {
                        System.out.println("(" + i + "*" + box3 + ")" + "(" + i + "*" + box2 + ")" + "(" + k + "*" + box1 + ")");
                    }


                }

            }


        }

    }}


