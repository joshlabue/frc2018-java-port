package frc.robot;

import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends SampleRobot {

  Drive drive;

  public Robot() {
    drive = new Drive();
  }

  @Override
  public void robotInit() {
  
  }

  
  @Override
  public void autonomous() {
   
  }

  @Override
  public void operatorControl() {
    while (isOperatorControl() && isEnabled()) {
      drive.process();

      // The motors will be updated every 5ms
      Timer.delay(0.005);
    }
  }

  /**
   * Runs during test mode.
   */
  @Override
  public void test() {
  }
}
