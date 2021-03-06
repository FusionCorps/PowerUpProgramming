package org.usfirst.frc.team6672.robot.commands;



/**
 *
 */
public class CloseGearHolderOnce extends CommandBase {

    public CloseGearHolderOnce() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(gearHolder);
    	setTimeout(1.2);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	gearHolder.close();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	gearHolder.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
