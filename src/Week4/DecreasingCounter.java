package Week4;

public class DecreasingCounter {
  private int value;           // object variable that remembers the value of the counter
  private int initialValue;    // object variable that remembers the initial value

  public DecreasingCounter(int valueAtStart) {
    this.value = valueAtStart;
    this.initialValue = valueAtStart;
  }

  public void printValue() {
    System.out.println("value: " + this.value);
  }

  public void decrease() {
    // Decrease the value by one, but ensure it does not drop below zero
    if (this.value > 0) {
      this.value--;
    }
  }

  public void reset() {
    // Reset the value to the initial value
    this.value = this.initialValue;
  }

  public void setInitial() {
    // Set the value back to the initial value
    this.value = this.initialValue;
  }
}
