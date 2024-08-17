/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author ruten
 */
public abstract class Inspection implements iInspection{

    private String location = "";
    private String hospitalName = "";
    private int yearsSinceInspection = 0;

    public Inspection() {
        
    }
   
    public Inspection(String Location, String HospitalName, int YearsSinceInspection) {
        location = Location;
        hospitalName = HospitalName;
        yearsSinceInspection = YearsSinceInspection;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.hospitalName = HospitalName;
    }

    public int getYearsSinceInspection() {
        return yearsSinceInspection;
    }

    public void setYearsSinceInspection(int yearsSinceInspection) {
        this.yearsSinceInspection = yearsSinceInspection;
    }

    public String toString() {
        return String.format("%s %s %d ",
                getLocation(), getHospitalName(), getYearsSinceInspection());
    }
}
