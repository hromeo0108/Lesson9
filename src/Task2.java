import java.util.Random;

public class Task2 {
    //Вывести элементы массива на экран в обратном порядке.
    public static void main(String[] args) {
        Integer[] array = new Integer[12];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        for (int i = array.length -1; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }

    }
}