@DrivingTest
Feature: Driver can drive their car

  Test package to ensure the driver can drive their car.

Scenario: Car accelerates when driver presses on the accelerator
  Given the driver has a car
  When the driver presses on the accelerator
  Then the car accelerates

Scenario: Car slows down when driver presses on the brake
  Given the driver has a car
  When the driver presses on the brake
  Then the car slows down