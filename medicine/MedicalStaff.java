package medicine;

public abstract class MedicalStaff extends Person {
    private String specialization;

    public MedicalStaff(String firstName, String lastName, int age, String specialization) {
        super(firstName, lastName, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public abstract void performDuty();

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}