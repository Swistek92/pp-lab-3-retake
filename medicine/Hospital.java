package medicine;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private final List<Patient> patients;
    private final List<MedicalStaff> staff;

    public Hospital() {
        this.patients = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addStaff(MedicalStaff medicalStaff) {
        staff.add(medicalStaff);
    }

    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

    public void removeStaff(MedicalStaff medicalStaff) {
        staff.remove(medicalStaff);
    }

    public void displayPatients() {
        for (Patient patient : patients) {
            patient.displayInfo();
        }
        System.out.println();
    }

    public void displayStaff() {
        for (MedicalStaff medicalStaff : staff) {
            medicalStaff.displayInfo();
        }
        System.out.println();
    }
}