package org.usfirst.frc.team6672.robot.commands;

/**
 *
 */
public class TurnRopeClimber extends CommandBase {

    public TurnRopeClimber() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(ropeClimber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	ropeClimber.turn();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	ropeClimber.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
