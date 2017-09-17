/**
 * Created by user on 9/16/2017.
 */


import java.util.Scanner;

public class Application {
    public Application() {
    }

    public static void main(String[] args) {
        int[] result = new int[5];
        double average =0;
        double sum = 0;
        int i = 0;
        Scanner in = new Scanner(System.in);

        for(int element: result) {

            System.out.print("Введите оценку " + (i+1) + " студента: ");
            result[i] = in.nextInt();
            i++;
        }

        if(result.length > 0) {
            for(int j = 0; j < result.length; j++) {
                sum += result[j];
            }
            average = sum / result.length;
            System.out.print("Средняя оценка = " + average);
        }

    }
}

