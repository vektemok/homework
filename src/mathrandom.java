import java.util.Random;

public class mathrandom {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = ran.nextInt(5);
            System.out.println(myArray[i]);
        }
        if (myArray[0] == myArray[1]) {
            System.out.println("Есть: " + myArray[1]);
        }  else if (myArray[1] == myArray[2]) {
            System.out.println("Есть: " + myArray[2]);
        } else if (myArray[2] == myArray[3]) {
            System.out.println("Есть: " + myArray[3]);
        }  else if (myArray[3] == myArray[4]) {
            System.out.println("Есть: " + myArray[4]);
        } else {
            System.out.println("нет");
        }


    }
}


