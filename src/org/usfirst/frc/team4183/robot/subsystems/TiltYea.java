package org.usfirst.frc.team4183.robot.subsystems;

import org.usfirst.frc.team4183.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TiltYea extends Subsystem {
    private DoubleSolenoid TiltYea;

    /**
     * Solenoid does its setting up
     */
    public TiltYea(){
        TiltYea = new DoubleSolenoid(RobotMap.TiltYea_SOLENOID_0, RobotMap.TiltYea_SOLENOID_1);
    }

    public void initDefaultCommand() {

    }

    public void setTiltYeaUp(boolean up){
        TiltYea.set(up? DoubleSolenoid.Value.kReverse: DoubleSolenoid.Value.kForward);
    }
}