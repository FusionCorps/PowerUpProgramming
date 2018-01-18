package org.usfirst.frc.team6672.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team6672.robot.commands.*;
import org.usfirst.frc.team6672.robot.triggers.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	Joystick stick = new Joystick(0);
	Button button1 = new JoystickButton(stick, 1);
	Button button2 = new JoystickButton(stick, 2);
	Button button3 = new JoystickButton(stick, 3);
	Button button4 = new JoystickButton(stick, 4);
	Button button5 = new JoystickButton(stick, 5);
	Button button6 = new JoystickButton(stick, 6);
	Button button7 = new JoystickButton(stick, 7);
	
	Trigger autoGearOpen;
	Trigger autoGearClose;
	Trigger manualGearOpen;
	Trigger manualGearClose;
	
	public double getStickAxis1(){
		double stickAxis1 = stick.getRawAxis(1);
		return stickAxis1;
	}
	
	public double getStickAxis4(){
		double stickAxis4 = stick.getRawAxis(4);
		return stickAxis4;
	}
	
	public boolean autoGearOpenPressed() {
		return stick.getRawAxis(3) > .5 ;
	}
	
	public boolean autoGearClosePressed() {
		return stick.getRawAxis(2) > .5 ;
	}
	
	public boolean manualGearOpenActivated() {
		return button7.get() && stick.getRawAxis(3) > .5 ;
	}
	
	public boolean manualGearCloseActivated() {
		return button7.get() && stick.getRawAxis(2) > .5 ;
	}
	
	public OI(){
//		autoGearOpen = new AutoGearOpen();
//		autoGearClose = new AutoGearClose();
//		manualGearOpen = new ManualGearOpen();
//		manualGearClose = new ManualGearClose();
//		
//		autoGearOpen.whenActive(new OpenGearHolderOnce());
//		autoGearClose.whenActive(new CloseGearHolderOnce());
//		manualGearOpen.whileActive(new OpenGearHolderContinued());
//		manualGearClose.whileActive(new CloseGearHolderContinued());
		button3.whenPressed(new SetRotateSpeed(0.6));
		button2.whenPressed(new SetRotateSpeed(0.7));
		button1.whenPressed(new SetRotateSpeed(1.0));
		button4.whileHeld(new TurnRopeClimber());
		button5.whenPressed(new SetDriveSpeed(0.8));
		button6.whenPressed(new SetDriveSpeed(1.0));
		
	}
	
}
