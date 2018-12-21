package rv.rover;

public class Rover {
	//ATTRIBUTES
	private Position roverPosition;
	private Speed roverSpeed;
	private Direction roverDirection;
	
	//CONSTRUCTOR
	public Rover() {
		roverPosition = new Position();
		roverSpeed = new Speed();
		roverDirection = new Direction();
	}
	
	//METHODS
		public void moveForward() {
			roverPosition.setY(aStepForward());
		}
		public void moveBackward() {
			roverPosition.setY(aStepBackward());
		}
		public void turnRight() {
			roverDirection.turnRight();
		}
		public void turnLeft() {
			roverDirection.turnLeft();
		}
		
	//REFACTORED
	public int aStepForward() {
		return roverPosition.getY()+roverSpeed.getSpeed();
	}
	public int aStepBackward() {
		return roverPosition.getY()-roverSpeed.getSpeed();
	}
	
	//GETTERS AND SETTERS
	public Position getRoverPosition() {
		return roverPosition;
	}

	public void setRoverPosition(Position roverPosition) {
		this.roverPosition = roverPosition;
	}

	public Speed getRoverSpeed() {
		return roverSpeed;
	}

	public void setRoverSpeed(Speed roverSpeed) {
		this.roverSpeed = roverSpeed;
	}

	public Direction getRoverDirection() {
		return roverDirection;
	}

	public void setRoverDirection(Direction roverDirection) {
		this.roverDirection = roverDirection;
	}
}
