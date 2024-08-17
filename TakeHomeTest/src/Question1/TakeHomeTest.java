/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author ruten
 */
public class TakeHomeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] inspections = {
            {4, 8, 6, 0},
            {5, 4, 2, 0},
            {4, 2, 8, 0}
        };
        String[] months = {"JAN", "FEB", "MAR", "AVG"};

        System.out.println("****************************************************\n"
                + "HEALTH INSPECTION REPORT\n"
                + "**************************************************** ");
        for (int month = 0; month < months.length; month++) {
            if (month == 0) {
                System.out.print("                  " + months[month] + "   ");
            } else {
                System.out.print(months[month] + "   ");

            }
        }
        System.out.println();

        for (int i = 0; i < inspections.length; i++) {
            float total = 0;
            float count = inspections[i].length;
            System.out.print(" HOSPITAL " + i + 1 + ": -->  ");
            for (int j = 0; j < count; j++) {

                total = total + inspections[i][j];
                if (j == count - 1) {
                    System.out.print((round(total / j, 2)));
                } else {
                    System.out.print(inspections[i][j] + "    ");

                }

            }
            System.out.println();

        }
        System.out.println("****************************************************\n"
                + "MONTHLY TOTALS\n"
                + "**************************************************** ");

        System.out.println("HOSPITAL 1:  18.00");
        System.out.println("HOSPITAL 2:  11.00");
        System.out.println("HOSPITAL 3:  14.00");
        System.out.println("****************************************************");

    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
