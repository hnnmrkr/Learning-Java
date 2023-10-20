package Week9.Ex17;

import Week9.Ex17.mooc.logic.ApplicationLogic;
import Week9.Ex17.mooc.ui.UserInterface;
import Week9.Ex17.mooc.ui.TextUserInterface;

public class Main {
  public static void main(String[] args) {
    UserInterface ui = new TextUserInterface();
    new ApplicationLogic(ui).execute(3);
  }
}
