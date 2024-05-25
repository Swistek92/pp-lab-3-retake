import medicine.*;

public class Main {
    public static void main(String[] args) {
        // Utwórz instancję klasy Hospital
        Hospital hospital = new Hospital();

        // Utwórz instancje klasy Patient
        Patient elliot = new Patient("Elliot", "Alderson", 28, "Depression", 101);
        Patient angela = new Patient("Angela", "Moss", 29, "Anxiety", 102);
        Patient darlene = new Patient("Darlene", "Alderson", 26, "PTSD", 103);
        Patient mrRobot = new Patient("Mr.", "Robot", 45, "Dissociative Identity Disorder", 104);

        // Utwórz instancje klasy Doctor
        Doctor krista = new Doctor("Krista", "Gordon", 40, "Psychiatry");

        // Utwórz instancje klasy Nurse
        Nurse nurse = new Nurse("Sara", "Smith", 35, "Pediatrics");

        // Dodaj do staff obiektu Hospital doktora oraz pielęgniarza/pielęgniarkę
        hospital.addStaff(krista);
        hospital.addStaff(nurse);

        // Dodaj do patients obiektu Hospital wszystkich utworzonych pacjentów
        hospital.addPatient(elliot);
        hospital.addPatient(angela);
        hospital.addPatient(darlene);
        hospital.addPatient(mrRobot);

        // Wyświetl informacje o wszystkich pracownikach medycznych w Hospital
        hospital.displayStaff();

        // Wyświetl informacje o wszystkich pacjentach w Hospital
        hospital.displayPatients();

        // Stwórz dwie nowe instancje obiektu Patient
        Patient patient1 = new Patient("Leonard", "Cohen", 60, "Flu", 105);
        Patient patient2 = new Patient("Rachel", "Green", 32, "Broken Arm", 106);

        // Dodaj nowe instancje pacjentów do Hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Stwórz nową instancję obiektu Doctor
        Doctor doctor2 = new Doctor("Meredith", "Grey", 39, "Surgery");

        // Stwórz trzy nowe instancje obiektu Nurse
        Nurse nurse2 = new Nurse("Alex", "Karev", 30, "Pediatrics");
        Nurse nurse3 = new Nurse("Cristina", "Yang", 35, "Cardiology");
        Nurse nurse4 = new Nurse("Izzie", "Stevens", 29, "Oncology");

        // Dodaj nowe instancje doktora i pielęgniarek do Hospital
        hospital.addStaff(doctor2);
        hospital.addStaff(nurse2);
        hospital.addStaff(nurse3);
        hospital.addStaff(nurse4);

        // Usuń jednego pacjenta oraz jednego pielęgniarza/pielęgniarkę
        hospital.removePatient(elliot);
        hospital.removeStaff(nurse);

        // Wyświetl ponownie informacje o patients i staff obiektu Hospital
        hospital.displayStaff();
        hospital.displayPatients();

        // Ustaw nowe wartości dla illness, roomNumber oraz specialization
        angela.setIllness("Paranoia");
        angela.setRoomNumber(107);

        krista.setSpecialization("Clinical Psychology");

        // Wyświetl nowe informacje
        System.out.println("Updated Patient Info:");
        angela.displayInfo();
        System.out.println();

        System.out.println("Updated Doctor Info:");
        krista.displayInfo();
        krista.performDuty();
    }
}