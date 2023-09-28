package Week5;

public class Ex86 {
  public static void main(String[] args) {
    LyyraCard cardOfPekka = new LyyraCard(10);

    System.out.println("money on the card " + cardOfPekka.balance());
    boolean succeeded = cardOfPekka.pay(8);
    System.out.println("money taken: " + succeeded);
    System.out.println("money on the card " + cardOfPekka.balance());

    succeeded = cardOfPekka.pay(4);
    System.out.println("money taken: " + succeeded);
    System.out.println("money on the card " + cardOfPekka.balance());

    CashRegister unicafeExactum = new CashRegister();

    double theChange = unicafeExactum.payEconomical(10);
    System.out.println("the change was " + theChange);

    theChange = unicafeExactum.payEconomical(5);
    System.out.println("the change was " + theChange);

    theChange = unicafeExactum.payGourmet(4);
    System.out.println("the change was " + theChange);

    System.out.println(unicafeExactum);

    CashRegister unicafeExactum2 = new CashRegister();

    double theChange2 = unicafeExactum2.payEconomical(10);
    System.out.println("the change was " + theChange2);

    LyyraCard cardOfJim = new LyyraCard(7);

    boolean succeeded2 = unicafeExactum2.payGourmet(cardOfJim);
    System.out.println("payment success: " + succeeded2);
    succeeded2 = unicafeExactum2.payGourmet(cardOfJim);
    System.out.println("payment success: " + succeeded2);
    succeeded2 = unicafeExactum2.payEconomical(cardOfJim);
    System.out.println("payment success: " + succeeded2);

    System.out.println(unicafeExactum2);

    CashRegister unicafeExactum3 = new CashRegister();
    System.out.println(unicafeExactum3);

    LyyraCard cardOfJim2 = new LyyraCard(2);

    System.out.println("the card balance " + cardOfJim2.balance() + " euros");

    boolean succeeded3 = unicafeExactum3.payGourmet(cardOfJim2);
    System.out.println("payment success: " + succeeded3);

    unicafeExactum3.loadMoneyToCard(cardOfJim2, 100);

    succeeded3 = unicafeExactum3.payGourmet(cardOfJim2);
    System.out.println("payment success: " + succeeded3);

    System.out.println("the card balance " + cardOfJim2.balance() + " euros");

    System.out.println(unicafeExactum3);
  }
}

class LyyraCard {
  private double balance;

  public LyyraCard(double balance) {
    this.balance = balance;
  }

  public double balance() {
    return this.balance;
  }

  public void loadMoney(double amount) {
    if (amount > 0) {
      this.balance += amount;
    }
  }

  public boolean pay(double amount) {
    if (this.balance >= amount) {
      this.balance -= amount;
      return true;
    } else {
      return false;
    }
  }
}

class CashRegister {
  private double cashInRegister;
  private int economicalSold;
  private int gourmetSold;

  public CashRegister() {
    this.cashInRegister = 1000.0;
  }

  public double payEconomical(double cashGiven) {
    double price = 2.50;
    if (cashGiven >= price) {
      this.cashInRegister += price;
      this.economicalSold++;
      return cashGiven - price;
    } else {
      return cashGiven;
    }
  }

  public double payGourmet(double cashGiven) {
    double price = 4.00;
    if (cashGiven >= price) {
      this.cashInRegister += price;
      this.gourmetSold++;
      return cashGiven - price;
    } else {
      return cashGiven;
    }
  }

  public boolean payEconomical(LyyraCard card) {
    double price = 2.50;
    if (card.balance() >= price) {
      card.pay(price);
      this.economicalSold++;
      return true;
    } else {
      return false;
    }
  }

  public boolean payGourmet(LyyraCard card) {
    double price = 4.00;
    if (card.balance() >= price) {
      card.pay(price);
      this.gourmetSold++;
      return true;
    } else {
      return false;
    }
  }

  public void loadMoneyToCard(LyyraCard card, double sum) {
    if (sum > 0) {
      card.loadMoney(sum);
      this.cashInRegister += sum;
    }
  }

  public String toString() {
    return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
  }
}

