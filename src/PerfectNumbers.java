import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            //enter number from consol
            System.out.println("enter number: ");
            int number = scanner.nextInt();
            int cem = 0;
            //get figure untill number
            for (int i = 1; i < number; i++) {
                //check split or not
                if (number % i == 0) {
                    cem = cem + i;
                }
            }
            //check equaling
            if (number == cem) {
                System.out.println("this is perfect number");
            } else {
                System.out.println("this isn't perfect number");
            }


        }}}
