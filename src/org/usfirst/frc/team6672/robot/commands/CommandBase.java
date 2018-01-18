package org.usfirst.frc.team6672.robot.commands;

import org.usfirst.frc.team6672.robot.OI;
import org.usfirst.frc.team6672.robot.subsystems.DriveMechanism;
import org.usfirst.frc.team6672.robot.subsystems.GearHolder;
import org.usfirst.frc.team6672.robot.subsystems.RopeClimber;


import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	
	public static OI oi;
	public static DriveMechanism driveMechanism = new DriveMechanism();
    public static GearHolder gearHolder = new GearHolder();
    public static RopeClimber ropeClimber = new RopeClimber();
    
    
    public static void init() {
    	System.out.println("Command Base initting");
    	oi = new OI();
    	System.out.println("Command Base initted");
    }
    
}
