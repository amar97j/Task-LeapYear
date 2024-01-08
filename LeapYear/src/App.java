import java.util.Scanner;

import javax.swing.plaf.nimbus.State;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a Year: ");

        int year = myScanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + "  is a leap year");

        } else {
            System.out.println(year + "  is not a leap year");
        }
        myScanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
