import java.util.Random;

public class Task5 {
    //Дан массив.Определить:
    // 1.количество максимальных элементов в массиве;
    // 2.количество минимальных элементов в массиве
    public static void main(String[] args) {
        Integer[] array = new Integer[30];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-20, 20);
            System.out.print(array[i] + " ");
        }

        int countMax = 0;
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                countMax++;
            }
        }System.out.println("\nколичество максимальных элементов массива: " + countMax);

            int countMin = 0;
            int min = array[0];

            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (min == array[i]) {
                    countMin++;
                }
            }System.out.println("количество минимальных элементов в массиве: " + countMin);
        }
    }


