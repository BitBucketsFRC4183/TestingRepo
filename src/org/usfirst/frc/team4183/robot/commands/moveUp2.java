package org.usfirst.frc.team4183.robot.commands;

import org.usfirst.frc.team4183.robot.OI;
import org.usfirst.frc.team4183.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team4183.robot.subsystems.UrMumStacks;

import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class moveUp2 extends Command {
	
	public static final UrMumStacks urMumStacks = new UrMumStacks();
	
	
    public moveUp2() {
        // Use requires() here to declare subsystem dependencies
        requires(urMumStacks);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        	urMumStacks.setPullMotor(urMumStacks.returnPullMotor()+4033);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
