package org.usfirst.frc.team694.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Servo;

/**
 *
 */
public class Paddle extends Subsystem {
    
    Servo servo;
    
    public Paddle() {
    	servo = new Servo(10);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void rotateForward() {
    	servo.set(0.0);
    }
    
    public void rotateBackward() {
    	servo.set(1.0);
    }
    
    public boolean isForward() {
    	return servo.get() <= 0.1;
    }
}