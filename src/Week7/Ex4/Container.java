package Week7.Ex4;
import java.util.ArrayList;

public class Container {

  private int maxWeight;
  private ArrayList<Suitcase> suitcases;

  public Container(int weight) {
    this.suitcases = new ArrayList<Suitcase>();
    this.maxWeight = weight;
  }

  public void addSuitcase(Suitcase suitcase) {
    if (containerWeight() + suitcase.totalWeight() <= maxWeight) {
      suitcases.add(suitcase);
    }
  }

  public String toString() {
    return suitcases.size() + " suitcases (" + containerWeight() + " kg)";
  }

  public int containerWeight() {
    int weight = 0;
    for (Suitcase suitcase : suitcases) {
      weight += suitcase.totalWeight();
    }
    return weight;
  }

  public void printThings() {
    for (Suitcase suitcase : suitcases) {
      suitcase.printThings();
    }
  }
}
