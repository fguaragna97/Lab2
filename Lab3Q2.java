import java.util.ArrayList;
import java.util.Random;

public class Lab3Q2 {
  public static void main(String[] args) {

    Random rand = new Random(); // instance of random class
    int upperbound = 50;
    // generate random values from 0-50

    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(rand.nextInt(upperbound));
    myNumbers.add(rand.nextInt(upperbound));
    myNumbers.add(rand.nextInt(upperbound));
    myNumbers.add(rand.nextInt(upperbound));
    myNumbers.add(rand.nextInt(upperbound));
    myNumbers.add(rand.nextInt(upperbound));
    myNumbers.add(rand.nextInt(upperbound));
    myNumbers.add(rand.nextInt(upperbound));
    myNumbers.add(rand.nextInt(upperbound));
    myNumbers.add(rand.nextInt(upperbound));

    ArrayList<Object> myObject = new ArrayList<Object>(myNumbers);

    myNumbers.set(9, -5);

    System.out.println(myNumbers);
    System.out.println(myObject);
  }
}
