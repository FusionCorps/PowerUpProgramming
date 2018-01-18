package org.usfirst.frc.team6672.robot.triggers;

import org.usfirst.frc.team6672.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class ManualGearClose extends Trigger {

    public boolean get() {
    	if (CommandBase.oi == null) {
    		return false;
    	}
    	return CommandBase.oi.manualGearCloseActivated();
    }
}
