import medicine.Patient;
import medicine.Doctor;

public class Main {
    public static void main(String[] args) {
        Patient elliot = new Patient("Elliot", "Alderson", 28, "Depression", 101);
        Patient angela = new Patient("Angela", "Moss", 29, "Anxiety", 102);
        Patient darlene = new Patient("Darlene", "Alderson", 26, "PTSD", 103);
        Patient mrRobot = new Patient("Mr.", "Robot", 45, "Dissociative Identity Disorder", 104);

        elliot.displayInfo();
        System.out.println();
        angela.displayInfo();
        System.out.println();
        darlene.displayInfo();
        System.out.println();
        mrRobot.displayInfo();
        System.out.println();

        System.out.println("Before update:");
        System.out.println("Name: " + elliot.getFirstName() + " " + elliot.getLastName());
        System.out.println("Illness: " + elliot.getIllness());
        System.out.println("Room number: " + elliot.getRoomNumber());

        elliot.setIllness("Paranoia");
        elliot.setRoomNumber(105);

        System.out.println("After update:");
        System.out.println("Name: " + elliot.getFirstName() + " " + elliot.getLastName());
        System.out.println("Illness: " + elliot.getIllness());
        System.out.println("Room number: " + elliot.getRoomNumber());

        Doctor krista = new Doctor("Krista", "Gordon", 40, "Psychiatry");
        krista.displayInfo();
        krista.performDuty();
        System.out.println("Specialization: " + krista.getSpecialization());

        krista.setSpecialization("Clinical Psychology");
        System.out.println("Updated Specialization: " + krista.getSpecialization());
    }
}