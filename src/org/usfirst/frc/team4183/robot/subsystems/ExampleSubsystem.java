
package org.usfirst.frc.team4183.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
	CANTalon topRight = new CANTalon(2);
	CANTalon backRight = new CANTalon(4);
	CANTalon topLeft = new CANTalon(1);
	CANTalon backLeft = new CANTalon(3);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

