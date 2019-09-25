public class Driver
{
  private Car car;

  public Driver(Car car)
  {
    this.car = car;
  }

  public void pushDownOnAccelerator()
  {
    car.startAccelerating();
  }

  public void pushDownOnBrake()
  {
    car.startBraking();
  }
}
