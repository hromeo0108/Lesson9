import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    //Составить программу:
    //1.нахождения минимального значения среди элементов любой строки двумерного массива;
    //2.нахождения максимального значения среди элементов любого столбца двумерного массива
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер строки (1-3):");
        int keyRow = sc.nextInt()-1;
        System.out.println("Введите номер столбца (1-3):");
        int keyCol = sc.nextInt()-1;

        Random r = new Random();
        int[][] array2d = new int [r.nextInt(3,4)][r.nextInt(3,4)];


        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = r.nextInt(20);
//                System.out.print(array2d[i][j] + " ");
            }
        }
        for (int i = 0; i < array2d.length; i++) {
            System.out.println(Arrays.toString(array2d[i]));
        }
            int maxRow = 0;
            int minCol = array2d.length;
            for (int i = 0; i < array2d.length; i++) {
                if (maxRow < array2d[keyRow][i]) {
                    maxRow = array2d[keyRow][i];
                }
                if (minCol > array2d[i][keyCol]) {
                    minCol = array2d[i][keyCol];
                }
            }
            keyCol++;
            keyRow++;
            System.out.println("Максимальное значение элементов " + keyRow  + " строки = " + maxRow);
            System.out.println("Минимальное значение элементов " + keyCol  + " столбца = " + minCol);
        }

    }