/**
 * Cereal.java
 *
 * @author – Your name
 * @author – Class period
 *
 */
public class Cereal {
  // private instance variables to hold info about a cereal from the data set
  // the name, calories, fiber, carbohydrates, and cups
  private String name;
  private double calories;
  private double fiber;
  private double cups;
  private double carbs;

  // constructor that creates a cereal object
  public Cereal(String name, double calories, double fiber, double carbs,
                double cups) {
    this.name = name;
    this.calories = calories;
    this.fiber = fiber;
    this.carbs = carbs;
    this.cups = cups;
  }

  // accessor methods for each instance variable
  String getName() { return name; }

  double getCalories() { return calories; }

  double getFiber() { return fiber; }

  double getCarbs() { return carbs; }

  double getCups() { return cups; }

  /*
   * toString method returns the values stored in the instance variables
   * concatenated in a sentence starting with "Cereal: "
   */
  public String toString() {
    return "Cereal:" + name + "," + calories + "," + fiber + "," + carbs + "," +
        cups;
  }
}
