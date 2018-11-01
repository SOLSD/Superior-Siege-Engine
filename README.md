# Superior-Siege-Engine
//CATAPULT ARM MOVEMENT
public class yeetMk1 {
	public static void main(String[] args) {
		RegulatedMotor attack = new EV3LargeRegulatedMotor(MotorPort.A);
		attack.setSpeed(10000); // 2 Revolutions Per Second ( RPS )
		attack.rotate(110);
	}
}
