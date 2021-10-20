import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cars.Car;

public class Lab3Q3 {
  public static void main(String[] args) {
    Car c1 = new Car("Mercedes", "Class C", 1995);
    Car c2 = new Car("Ferrari", "California", 1997);
    Car c3 = new Car("Aston Martin", "X01", 1963);
    Car c4 = new Car("Porshe", "Carrera", 1992);

    List<Car> cars = new ArrayList<Car>();
    cars.add(c1);
    cars.add(c2);
    cars.add(c3);
    cars.add(c4);

    // UnSorted List
    System.out.println(cars);

    Collections.sort(cars);

    // Default Sorting by year
    System.out.println(cars);
  }
}
