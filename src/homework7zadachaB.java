import java.util.Random;
import java.util.Scanner;

public class homework7zadachaB {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int[] myArray = new int[num];
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = ran.nextInt(13);
//            System.out.println(myArray[i]);
//        }
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = ran.nextInt(12);
//            if (myArray[i] == 1) {
//                System.out.println("Январь");
//            } else if (myArray[i] == 2) {
//                System.out.println("Февраль");
//            } else if (myArray[i] == 3) {
//                System.out.println("Март");
//            } else if (myArray[i] == 4) {
//                System.out.println("Апрель");
//            } else if (myArray[i] == 5) {
//                System.out.println("Май");
//            } else if (myArray[i] == 6) {
//                System.out.println("Июнь");
//
//            } else if (myArray[i] == 7) {
//                System.out.println("Июль");
//
//            } else if (myArray[i] == 8) {
//                System.out.println("Август");
//
//            } else if (myArray[i] == 9) {
//                System.out.println("Сентябрь");
//
//            } else if (myArray[i] == 10) {
//                System.out.println("Октябрь");
//
//            } else if (myArray[i] == 11) {
//                System.out.println("Ноябрь");
//
//            } else if (myArray[i] == 12) {
//                System.out.println("Декабрь");
//            }
//        }

            //============================================================================



                //
            String[] listLine = new String[12];
            listLine[0] = "Январь";
            listLine[1] = "Февраль";
            listLine[2] = "Март";
            listLine[3] = "Апрель";
            listLine[4] = "Май";
            listLine[5] = "Июнь";
            listLine[6] = "Июль";
            listLine[7] = "Август";
            listLine[8] = "Сентябрь";
            listLine[9] = "Октябрь";
            listLine[10] = "Ноябрь";
            listLine[11] = "Декабрь";

            int key = sc.nextInt();
            int[] numList = new int[key];
        for (int i = 0; i < numList.length; i++) {
            numList[i] = ran.nextInt(13) + 1;
        }
        for (int i = 0; i < numList.length; i++) {
            System.out.print(listLine[numList[i] - 1 ]  + ", ");
        }





    }
}





