/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author ruten
 */
public class Property {

    public static void main(String[] args) {

        int[][] property = {
            {800000, 1500000, 2000000},
            {700000, 1200000, 1600000},
            {750000, 1300000, 1800000}
        };
        String[] propType = {"FLAT", "TOWN HOUSE", "HOUSE"};
        String[] province = {"Gauteng", "Natal  ", "Cape   "};

        System.out.println("----------------------------------------------------------------------------\n"
                + "Property Prices in different provinces\n"
                + "----------------------------------------------------------------------------");
        for (int prop = 0; prop < propType.length; prop++) {
            if (prop == 0) {
                System.out.print("                  " + propType[prop] + "      ");
            } else {
                System.out.print(propType[prop] + "     ");
            }
        }
        System.out.println();

        for (int i = 0; i < property.length; i++) {
            int total = 0;
            int count = property[i].length;
                System.out.print(province[i] + "         R ");
                for (int j = 0; j < count; j++) {

                    total = total + property[i][j];
                    if (j == count - 1) {
                        System.out.print(total);
                    } else {
                        System.out.print(property[i][j] + "      R ");
                    }
                }
                System.out.println();
            
        }

        int aveGau = (800000 + 1500000 + 2000000) / 3;
        int aveNat = (700000 + 1200000 + 1600000) / 3;
        int aveCape = (750000 + 1300000 + 1800000) / 3;
        System.out.println("\n"
                + "Average property prices in Gauteng = R" + aveGau
                + "\nAverage property prices in Natal = R" + aveNat
                + "\nAverage property prices in Cape = R" + aveCape);

    }

}
