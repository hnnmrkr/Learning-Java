package Week8.Ex9;

public class Main {
  public static void main(String[] args) {
    VehicleRegister register = new VehicleRegister();

    RegistrationPlate plate1 = new RegistrationPlate("FI", "ABC-123");
    RegistrationPlate plate2 = new RegistrationPlate("FI", "UXE-465");
    RegistrationPlate plate3 = new RegistrationPlate("D", "B WQ-431");

    register.add(plate1, "Peeter");
    register.add(plate3, "Jürgen");

    System.out.println("Owner of plate1: " + register.get(plate1));
    System.out.println("Owner of plate2: " + register.get(plate2));
    System.out.println("Owner of plate3: " + register.get(plate3));

    register.printRegistrationPlates();
    System.out.println("Owners:");
    register.printOwners();
  }
}
