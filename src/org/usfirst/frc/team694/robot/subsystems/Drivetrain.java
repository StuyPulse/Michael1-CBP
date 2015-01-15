package org.usfirst.frc.team694.robot.subsystems;

import org.usfirst.frc.team694.robot.RobotMap;
import org.usfirst.frc.team694.robot.commands.DrivetrainTankDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	
	RobotDrive drive;
	
	public Drivetrain() {
		drive = new RobotDrive(RobotMap.DRIVETRAIN_LEFT_CHANNEL, RobotMap.DRIVETRAIN_RIGHT_CHANNEL);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DrivetrainTankDrive());
    }
    
    public void tankDrive(Joystick leftStick, Joystick rightStick) {
    	drive.tankDrive(leftStick, rightStick);
    }
}

