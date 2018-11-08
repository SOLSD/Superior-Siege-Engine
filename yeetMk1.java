import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class yeetMk1 {
	public static void main(String[] args) {
		RegulatedMotor attack = new EV3LargeRegulatedMotor(MotorPort.A);
		attack.setSpeed(10000); // Max RPS
		attack.rotate(-180);
		Delay.msDelay(2000);
		attack.rotate(180);
	}
}
