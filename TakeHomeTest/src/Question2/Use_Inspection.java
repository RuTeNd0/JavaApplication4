/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author ruten
 */
public class Use_Inspection {
    
    public static void main(String[] args) {
        
        HospitalInspections insp = new HospitalInspections("Eastern Cape", "St Augustine Hospital", 3);
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the hospital location: ");
        String location = keyboard.next();
        insp.setLocation(location);
        System.out.println("Enter the hospital name: ");
        String hospitalName = keyboard.next();
        insp.setHospitalName(hospitalName);
        
        System.out.println("Enter years since last inspection: ");
        int yearsSinceInspection = keyboard.nextInt();
        insp.setYearsSinceInspection(yearsSinceInspection);
//        System.out.printf("%s %s %d ",insp.
//                , getHospitalName(), getYearsSinceInspection());

insp.printInspectionReport();
}
}
