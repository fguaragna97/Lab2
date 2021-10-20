import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3Q1 {
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

    System.out.println(myNumbers);

    Scanner sc = new Scanner(System.in); // System.in is a standard input stream
    System.out.print("What number are you looking for?");
    int userNumber = sc.nextInt();

    System.out.println("Is your Number in the list? " + myNumbers.contains(userNumber));

    sc.close();
  }
}
