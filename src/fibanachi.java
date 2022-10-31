public class fibanachi {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        int summ = 0;
//        System.out.println(a);
//        System.out.println(b);
//
//        for (int i = 0; i < 1000; i++) {
//            summ = a + b;
//
//
//            System.out.println(summ);
//
//            a = b;
//            b = summ;
//
//
//        }

        int flag = 0;
        for (int i = 1; i < 1000; i++) {

            flag = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    flag++;

                }
            }
            if (flag<=2){
                System.out.println(i);
            }

        }


    }
}
