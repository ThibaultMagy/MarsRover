package rv.rover;

public class Direction {
	//ATTRIBUTES
	private String direction;
	
	//CONSTRUCTOR
	public Direction() {
		this.direction = "N";
	}
	public Direction(String direction) {
		this.direction = direction;
		correctDirection();
	}
	
	//METHODS
	public void turnRight() {
		if(direction == "N") {
			direction = "E";
		}
		else if(direction == "E"){
			direction = "S";
		}
		else if(direction == "S") {
			direction = "W";
		}
		else {
			direction = "N";
		}
	}
	
	public void turnLeft() {
		if(direction == "N") {
			direction = "W";
		}
		else if(direction == "W"){
			direction = "S";
		}
		else if(direction == "S") {
			direction = "E";
		}
		else {
			direction = "N";
		}
	}
	
	public void correctDirection() {
		if((direction != "N") || (direction != "E") || (direction != "S") || (direction != "W")) {
			direction = "N";
		}
	}
	
}
