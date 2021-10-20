package cars;

public class Car implements Comparable<Car> {

  private String make = null;
  private String model = null;
  private int year = -1;

  public Car(String fmake, String fmodel, int lName) {
    this.make = fmake;
    this.model = fmodel;
    this.year = lName;
  }

  @Override
  public int compareTo(Car o) {
    return this.year - o.year;
  }

  // Setters and Getters

  @Override
  public String toString() {
    return " Car : " + make + " - " + model + " - " + year + "\n";
  }
}
