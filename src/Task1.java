import java.util.Random;

public class Task1 {
    //Заполнить массив из двенадцати элементов 1,2,...12.
    public static void main(String[] args) {

        Integer[] array  = new Integer[12];
        Random r = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(100);
            System.out.println(array[i]);
    }

    }

}
