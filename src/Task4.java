import java.util.Random;

public class Task4 {
    // Дан массив. Вывести на экран сначала его неотрицательные элементы, затем отрицательные.
    public static void main(String[] args) {
        Integer[] array = new Integer[20];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-100, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nнеотрицательные элементы массива:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\nотрицательные элементы массива:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
