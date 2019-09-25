public class CucumberExample
{
  public static void main()
  {
    Driver driver = new Driver(new Car());
    driver.pushDownOnAccelerator();
    driver.pushDownOnBrake();
  }
}
