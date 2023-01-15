import java.util.Random;

public class Task3 {
//    Определить:
//    1.сумму всех элементов массива;
//    2.произведение всех элементов массива;
//    3.сумму квадратов всех элементов массива;
//    4.сумму шести первых элементов массива.
    public static void main(String[] args) {
        Integer[] array = new Integer[12];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
            System.out.print(array[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.print("\nсумма всех элементов массива = " + sum);

        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult = mult * array[i];
        }
        System.out.print("\nпроизведение всех элементов массива = " + mult);

        double sqrSum = 0;
        for (int i = 0; i < array.length; i++) {
            double sqr = Math.sqrt(array[i]);
            sqrSum += sqr;
        }
        System.out.print("\nсумма квадратов всех элементов массива = " + sqrSum);

        int sumSix = 0;
        for (int i = 0; i < 6; i++) {
            sumSix += array[i];
        }
        System.out.print("\nсумм шести первых элементов массива = " + sumSix);
    }
}
