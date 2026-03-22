import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CerealRunner {
  // create a private instance variable to store an ArrayList of Cereal objects
  private ArrayList<Cereal> cereals;

  public CerealRunner(String fileName) {
    // instantiate the ArrayList
    cereals = new ArrayList<Cereal>();

    try {
      FileReader fileRdr = new FileReader(fileName);
      Scanner scan = new Scanner(fileRdr);
      while (scan.hasNext()) {
        String myStr = scan.nextLine();

        // use the split method to parse the data into an array of
        // String objects
        String[] uData = myStr.split(",");
        // go through each String array element and save it
        // into the appropriate variable which will be used to
        // create a Cereal object
        //
        // The name, calories, fiber, carbohydrates, and cups
        cereals.add(new Cereal(uData[0], Double.parseDouble(uData[1]),
                               Double.parseDouble(uData[2]),
                               Double.parseDouble(uData[3]),
                               Double.parseDouble(uData[4])));

        // create a new Cereal object, and add it to the ArrayList
      }
      scan.close();

    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    int numCereals = cereals.size();
    System.out.println(numCereals + " records created.");
  }

  public static void main(String[] args) {
    String fileName = "src/data/cerealSubset.csv";
    CerealRunner cr = new CerealRunner(fileName);
  }
}
