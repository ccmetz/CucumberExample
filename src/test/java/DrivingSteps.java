import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DrivingSteps {
  private Driver driver;
  private Car car;

  public DrivingSteps()
  {
    this.car = new Car();
  }

  @Given("the driver has a car")
  public void the_driver_has_a_car()
  {
    this.driver = new Driver(car);
  }

  @When("the driver presses on the (.*)")
  public void the_driver_presses_on_the_pedal(String pedalType)
  {
    if (pedalType.equalsIgnoreCase("accelerator"))
    {
      driver.pushDownOnAccelerator();
    }
    else if (pedalType.equalsIgnoreCase("brake"))
    {
      driver.pushDownOnBrake();
    }
  }

  @Then("the car accelerates")
  public void the_car_accelerates()
  {
    assertTrue(car.isAccelerating());
  }

  @Then("the car slows down")
  public void the_car_slows_down()
  {
    assertFalse(car.isAccelerating());
  }
}
