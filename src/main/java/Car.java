public class Car
{

  private boolean accelerating;

  public Car()
  {
    accelerating = false;
  }

  public void startAccelerating()
  {
    accelerating = true;
  }

  public void startBraking()
  {
    accelerating = false;
  }

  public boolean isAccelerating()
  {
    return accelerating;
  }
}
