package Week5;

public class Ex84 {
  private int value;
  private boolean check;

  public Ex84(int startingValue, boolean check) {
    this.value = startingValue;
    this.check = check;
  }

  public Ex84(int startingValue) {
    this(startingValue, false);
  }

  public Ex84(boolean check) {
    this(0, check);
  }

  public Ex84() {
    this(0, false);
  }

  public int value() {
    return value;
  }

  public void increase() {
    increase(1);
  }

  public void decrease() {
    decrease(1);
  }

  public void increase(int increaseAmount) {
    if (increaseAmount > 0) {
      value += increaseAmount;
    }
  }

  public void decrease(int decreaseAmount) {
    if (decreaseAmount > 0) {
      if (check) {
        value = Math.max(0, value - decreaseAmount);
      } else {
        value -= decreaseAmount;
      }
    }
  }

  public static void main(String[] args) {
    // Counter 1 parameter
    Ex84 counter1 = new Ex84(10, true);
    System.out.println("Counter 1: " + counter1.value());

    counter1.increase();
    System.out.println("Counter 1 after increase: " + counter1.value());

    counter1.decrease();
    System.out.println("Counter 1 after decrease: " + counter1.value());

    // Counter 2 parameter
    Ex84 counter2 = new Ex84(5);
    System.out.println("\nCounter 2: " + counter2.value());

    counter2.increase(3);
    System.out.println("Counter 2 after increase: " + counter2.value());

    counter2.decrease(2);
    System.out.println("Counter 2 after decrease: " + counter2.value());

    // Counter 3 parameter
    Ex84 counter3 = new Ex84(true);
    System.out.println("\nCounter 3 (with check): " + counter3.value());

    counter3.increase(5);
    System.out.println("Counter 3 after increase: " + counter3.value());

    counter3.decrease(10);
    System.out.println("Counter 3 after decrease: " + counter3.value());
  }
}

