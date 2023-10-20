package Week9.Ex18.moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
  private int maximumCapacity;
  private List<Thing> things;

  public Box(int maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
    this.things = new ArrayList<Thing>();
  }

  public boolean addThing(Thing thing) {
    if (getVolume() + thing.getVolume() <= maximumCapacity) {
      things.add(thing);
      return true;
    }
    return false;
  }

  @Override
  public int getVolume() {
    int totalVolume = 0;
    for (Thing thing : things) {
      totalVolume += thing.getVolume();
    }
    return totalVolume;
  }
}
