package org.usfirst.frc.team4183.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class UrMumStacks extends Subsystem {
    CANTalon pull = new CANTalon(7);
    
    DigitalInput reedAbove;
    DigitalInput reedBelow;
    
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public UrMumStacks(){
    	reedAbove = new DigitalInput(3);
    	reedBelow = new DigitalInput(2);
    	
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setPullMotor(double speed){
    	pull.set(speed);
    	
    }
    
    public double returnPullMotor(){
    	return pull.getEncPosition();
    }
}

