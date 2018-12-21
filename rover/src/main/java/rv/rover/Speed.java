package rv.rover;

public class Speed {
	//ATTRIBUTES
	private int speed;
	private int acceleration;
	private int accelerationMax;
	
	//CONSTRUCTOR
	public Speed() {
		speed = 1;
		acceleration = 1;
		accelerationMax = 1;
	}
	public Speed(int speed) {
		this.speed = speed;
		acceleration = 1;
		accelerationMax= 1;
	}
	
	//GETTERS AND SETTERS
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}
	public int getAccelerationMax() {
		return accelerationMax;
	}
	public void setAccelerationMax(int accelerationMax) {
		this.accelerationMax = accelerationMax;
	}
	
}
