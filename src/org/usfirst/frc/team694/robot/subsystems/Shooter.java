package org.usfirst.frc.team694.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team694.robot.RobotMap;


/**
 *
 */
public class Shooter extends Subsystem {
    
	Talon talon;
	 public Shooter() {
	    	talon = new Talon(RobotMap.SHOOTER_TALON_CHANNEL);
	 }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void vomit() {    
    	talon.set(1.0);
    }
    
    public void stop() {
    	talon.set(0.0);
    }
}
