package Week9.Ex18.moving.logic;

import Week9.Ex18.moving.domain.Item;
import Week9.Ex18.moving.domain.Thing;
import Week9.Ex18.moving.domain.Box;

import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    List<Thing> things = new ArrayList<Thing>();
    things.add(new Item("passport", 2));
    things.add(new Item("toothbrush", 1));
    things.add(new Item("book", 4));
    things.add(new Item("circular saw", 8));

    Packer packer = new Packer(10);

    List<Box> boxes = packer.packThings(things);

    System.out.println("Number of boxes: " + boxes.size());

    for (Box box : boxes) {
      System.out.println("  Things in the box: " + box.getVolume() + " dm^3");
    }
  }
}
