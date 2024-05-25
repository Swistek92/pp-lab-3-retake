package medicine;

public class Doctor extends MedicalStaff {

    public Doctor(String firstName, String lastName, int age, String specialization) {
        super(firstName, lastName, age, specialization);
    }

    @Override
    public void performDuty() {
        System.out.println("Doctor " + getFirstName() + " " + getLastName() + " is diagnosing patients.");
    }
}