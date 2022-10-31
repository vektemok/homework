import java.util.Random;

public class universal {
    public static void main(String[] args) {
        Random ran = new Random();
        int[][] num = new int[10][10];
        for (int i = 0; i < num.length ; i++) {

            for (int j = 0; j < num.length ; j++) {
                num[i][j] = ran.nextInt(150-10+1)+10;

            }
        }
        for (int i = 0; i < num.length ; i++) {
            System.out.println(num[i][i]);
            for (int j = 0; j < num.length ; j++) {
                System.out.println(num[j][j]);

            }

        }



            }

            }


