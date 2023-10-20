package Week9.Ex18.moving.logic;

import Week9.Ex18.moving.domain.Box;
import Week9.Ex18.moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
  private int boxesVolume;

  public Packer(int boxesVolume) {
    this.boxesVolume = boxesVolume;
  }

  public List<Box> packThings(List<Thing> things) {
    List<Box> boxes = new ArrayList<>();
    for (Thing thing : things) {
      boolean added = false;
      for (Box box : boxes) {
        if (box.addThing(thing)) {
          added = true;
          break;
        }
      }
      if (!added) {
        Box newBox = new Box(boxesVolume);
        newBox.addThing(thing);
        boxes.add(newBox);
      }
    }
    return boxes;
  }
}
