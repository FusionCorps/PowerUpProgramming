package org.usfirst.frc.team6672.robot.commands;

import org.usfirst.frc.team6672.robot.OI;
import org.usfirst.frc.team6672.robot.subsystems.DriveMechanism;
import org.usfirst.frc.team6672.robot.subsystems.GearHolder;
import org.usfirst.frc.team6672.robot.subsystems.RopeClimber;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	
	public static OI oi = new OI();
	public static DriveMechanism driveMechanism;
    public static GearHolder gearHolder;
    public static RopeClimber ropeClimber;
    
    
    public static void init() {
    	driveMechanism = new DriveMechanism();
    	gearHolder = new GearHolder();
    	ropeClimber = new RopeClimber();
    }
    
}
