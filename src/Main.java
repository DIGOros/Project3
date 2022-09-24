
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number;
        System.out.println("Enter any number from 1 to 10");
        number = in.nextInt();



        if (number >= 0) {
            System.out.println("x is positive");
            if (number != 5) {
                System.out.println("x is not equal 5");
            }

            if (number > 5) {
                System.out.println("x bigger than 5");
            }

            if (number < 9) {
                System.out.println("x is less than 9");
            }

            if (number >= 7) {
                System.out.println("x is equals 7");
            } else {
                System.out.println("x is less than 7");


                if (number == 5 || number == 6) {
                    System.out.println("Your number is 5 or 6");

                }
                if (number == 6 && number == 6) {
                    System.out.println("Your number is 6");

                }
                if (!(number < 0 )) {
                    System.out.println("Your number is not less than 0");
                }

                for (int x = 1; x <= 10; x++) {
                    for (int y = 1; y <= x; y++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }


            }
        }

    }
}
