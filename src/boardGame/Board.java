package boardGame;

public class Board {
	
	private int row;
	private int column;
	private Piece pieces[][];
	
	public Board(int row, int column) {

		this.row = row;
		this.column = column;
		this.pieces = new Piece[row][column];
	}

}
