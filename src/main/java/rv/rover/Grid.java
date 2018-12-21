package rv.rover;

public class Grid {
	//ATTRIBUTES
	private int[][] grid;
	private int size;
	
	//CONSTRUCTOR
	public Grid(int size) {
		this.size = size;
		this.grid = new int[size][size];
	}

	//GETTERS AND SETTERS
	public int[][] getGrid() {
		return grid;
	}
	public void setGrid(int[][] grid) {
		this.grid = grid;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
