package Week8.Ex9;

public class RegistrationPlate {
  private final String regCode;
  private final String country;

  public RegistrationPlate(String regCode, String country) {
    this.regCode = regCode;
    this.country = country;
  }

  public String toString() {
    return country + " " + regCode;
  }

  // Implement equals and hashCode here
}
