package medicine;

public class Patient extends Person {
    private String illness;
    private int roomNumber;

    public Patient(String firstName, String lastName, int age, String illness, int roomNumber) {
        super(firstName, lastName, age);
        this.illness = illness;
        this.roomNumber = roomNumber;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Illness: " + illness);
        System.out.println("Room number: " + roomNumber);
    }
}