package programmingcourse.timbuchalka;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortArray(arrayGenerator(5))));

    }
    public static int[] arrayGenerator(int sizeOfArray) {
        Random random = new Random();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i<array.length; i++) {
            array[i] = random.nextInt(1000);

        }
        return array;
    }
    public static int [] sortArray (int[] array)  {
        Arrays.sort(array);
            return array;
    }

}
