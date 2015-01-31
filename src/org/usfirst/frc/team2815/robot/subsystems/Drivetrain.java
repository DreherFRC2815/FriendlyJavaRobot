package org.usfirst.frc.team2815.robot.subsystems;
import org.usfirst.frc.team2815.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Victor leftMot[] = new Victor[2];
	public Victor rightMot[] = new Victor[2];
	public Talon straffeMot;
    
	public Drivetrain(){
		straffeMot = new Talon(RobotMap.straffemotor);
		leftMot[0]= new Victor(RobotMap.leftmotors[0]);
		leftMot[1]= new Victor(RobotMap.leftmotors[1]);
		rightMot[0]= new Victor(RobotMap.rightmotors[0]);
		rightMot[1]= new Victor(RobotMap.rightmotors[1]);
	}
	public 	void tankdrive(double leftSpeed, double rightSpeed){
		for (Victor lv : leftMot)
			lv.set(leftSpeed);
		for (Victor rv : rightMot)
			rv.set(rightSpeed);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    
}

