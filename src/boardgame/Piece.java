package boardgame;

public class Piece {
	
	protected Position position;  //posição da matri\
	
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}


	
	
	
	
	
}
