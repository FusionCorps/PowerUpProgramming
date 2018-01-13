package org.usfirst.frc.team6672.robot.triggers;

import org.usfirst.frc.team6672.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class ManualGearClose extends Trigger {

    public boolean get() {
    	return CommandBase.oi.manualGearCloseActivated();
    }
}
