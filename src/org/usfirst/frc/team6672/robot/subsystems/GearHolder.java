package org.usfirst.frc.team6672.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;

/**
 *
 */
public class GearHolder extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Spark motorGearHolder = new Spark(3);
	
	public void open() {
		motorGearHolder.setSpeed(-1.0);
	}
	
	public void close() {
		motorGearHolder.setSpeed(1.0);
	}
	
	public void stop() {
		motorGearHolder.setSpeed(0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
}

