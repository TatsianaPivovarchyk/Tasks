import java.util.Scanner;

/**
 * Created by user on 9/16/2017.
 */
public class Application {

    public static void main(String args[]) {

        Scanner scaner = new Scanner(System.in) ;
        double number1,number2,result;

        while (true) {

            System.out.println("Введите первое число: ");
            number1 = scaner.nextDouble();

            int operand = scaner.nextInt();

        switch (operand) {
            case 1:
                result = number1 + number2;
                System.out.println("Введите второе число: ");
                number2 = scaner.nextDouble();
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Введите второе число: ");
                number2 = scaner.nextDouble();
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            default:
                break;
        }

    }
    }
}
