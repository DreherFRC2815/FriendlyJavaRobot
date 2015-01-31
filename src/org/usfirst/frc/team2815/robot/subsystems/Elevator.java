package org.usfirst.frc.team2815.robot.subsystems;

import org.usfirst.frc.team2815.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
    private Talon windowMotors[] = new Talon[2];
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public Elevator(){
    	super ("Elevator");
    	
    	windowMotors[0] = new Talon (RobotMap.windmotors[5]);
    	windowMotors[1] = new Talon (RobotMap.windmotors[6]);
    }
    
    public void RaiseAndLowerElevator(double ySpeed){
    	windowMotors[0].set(ySpeed);
    	windowMotors[1].set(ySpeed);
    	
    }
}

