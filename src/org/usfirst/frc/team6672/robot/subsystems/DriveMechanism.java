package org.usfirst.frc.team6672.robot.subsystems;

import org.usfirst.frc.team6672.robot.commands.CommandBase;
import org.usfirst.frc.team6672.robot.commands.NormalDriving;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Spark;;

/**
 *
 */
public class DriveMechanism extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	
	// TODO get SpeedControllers set up properly. Documentation still has no args.
	
	SpeedController lSpeedController = new Spark(0);
	SpeedController rSpeedController = new Spark(1);
	
	DifferentialDrive robotDrive = new DifferentialDrive(lSpeedController, rSpeedController);
	ADXRS450_Gyro myGyro = new ADXRS450_Gyro();
	
	double driveSpeed = 0.6;
	double rotateSpeed = 0.6;
	
	public void setDriveSpeed(double newDriveSpeed) {
		driveSpeed = newDriveSpeed;
	}
	
	public void setRotateSpeed(double newRotateSpeed) {
		rotateSpeed = newRotateSpeed;
	}
	
	public void arcadeDrive() {
		robotDrive.arcadeDrive(CommandBase.oi.getStickAxis1() * driveSpeed, CommandBase.oi.getStickAxis4() * rotateSpeed);
	}
	
	public void gyroDrive(double xSpeed, double zRotation) {
		robotDrive.curvatureDrive(xSpeed, zRotation, false);
	}

	/*
	 * 	DEPRECATED because of RobotDrive deprecation
	 */
	
//	public void drive (double moveValue, double rotateValue) {
//		robotDrive.drive(moveValue, rotateValue);
//	}
	
	public double getGyroAngle() {
		return myGyro.getAngle();
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new NormalDriving());
    }
}

