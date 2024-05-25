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

        // Usuń pielęgniarza/pielęgniarkę z Hospital
        hospital.removeStaff(nurse);

        // Usuń ostatniego pacjenta z Hospital
        hospital.removePatient(mrRobot);

        // Wyświetl ponownie informacje o patients i staff obiektu Hospital
        hospital.displayStaff();
        hospital.displayPatients();

        // Ustaw nowe wartości dla illness, roomNumber oraz specialization
        elliot.setIllness("Paranoia");
        elliot.setRoomNumber(105);

        krista.setSpecialization("Clinical Psychology");

        // Wyświetl nowe informacje
        System.out.println("Updated Patient Info:");
        elliot.displayInfo();
        System.out.println();

        System.out.println("Updated Doctor Info:");
        krista.displayInfo();
        krista.performDuty();
    }
}