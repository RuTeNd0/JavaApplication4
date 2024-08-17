/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author ruten
 */
public class HospitalInspections extends Inspection 
{
    public HospitalInspections(String location, String HospitalName, int yearsSinceInspection) {
        super(location, HospitalName, yearsSinceInspection);
    }

    public String getInspectionNeeded(){
        String message = "";
        if (getYearsSinceInspection() >= 3) {
            message = "Yes";

        } else {
            message = "No";

        }
        return message;
    }

    public void printInspectionReport() {

        System.out.println("HOSPITAL INSPECTION REPORT\n"
                + "**********************************");
        System.out.println("HOSPITAL LOCATION: " + getLocation());
        System.out.println("HOSPITAL NAME: " + getHospitalName());
        System.out.println("YEARS SINCE LAST INSPECTION: " + getYearsSinceInspection());
        System.out.println("INSPECTION NEEDED: " + getInspectionNeeded());
        

    }
}
