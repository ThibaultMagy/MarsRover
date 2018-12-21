package rv.rover;

public class RoverInterface {
	//ATTRIBUTES
	private Rover rover;
	private Grid grid;
	private String[] commands;
	
	//CONSTRUCTORS
	public RoverInterface() {
		rover = new Rover();
		grid = new Grid(CONST.SIZE);
	}
	
	//METHODS
	public void checkWrapper() {
		if(rover.getRoverPosition().getX() > grid.getSize()){
			rover.setRoverPosition(new Position(0,rover.getRoverPosition().getX()));
		}
		else if(rover.getRoverPosition().getX() < 0) {
			rover.setRoverPosition(new Position(CONST.SIZE,rover.getRoverPosition().getX()));
		}
	}
}
