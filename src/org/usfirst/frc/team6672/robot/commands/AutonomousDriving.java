package org.usfirst.frc.team6672.robot.commands;


/**
 *
 */
public class AutonomousDriving extends CommandBase {

    public AutonomousDriving() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(driveMechanism);
    	setTimeout(3);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	driveMechanism.gyroDrive(.5, driveMechanism.getGyroAngle()*0.03*.35);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	driveMechanism.arcadeDrive();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
