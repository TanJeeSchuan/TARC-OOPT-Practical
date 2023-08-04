/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practical.practical2q2;


/**
 *
 * @author Tan Jee Schuan
 */
public class Practical2Q2 {
        public static boolean leapYearChecker(int year)
        {
            if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0)
                return true;
            else
                return false;
        }

        public static void main(String[] args) {
            int year = 2020;
            boolean isLeapYear;

            isLeapYear = leapYearChecker(year);

            if (isLeapYear)
                System.out.println(year + " is leap year");
            else
                System.out.println(year + " is not leap year");
        }
}
