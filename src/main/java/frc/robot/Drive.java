package frc.robot;

import edu.wpi.first.wpilibj.*;

public class Drive {

    Spark driveLeft;
    Spark driveRight;

    public Drive() {
        driveLeft = new Spark(0);
        driveRight = new Spark(1);
    }


    public void process() {
        
    }
}