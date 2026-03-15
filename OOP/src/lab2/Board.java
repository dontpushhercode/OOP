package lab2;
//p:2
public class Board {
	private Piece[][] board;
	
	public Board() {
		board = new Piece[8][8];
	}
	
	public void addPiece(Piece p, Position pos) {
		if(!checkBounds(pos)) {
			System.out.println("Incorrect position");
			return;
		}
		p.a = pos;
		setPieceAt(pos, p);
	}
	
	public Piece getPieceAt(Position pos) {
		if (!checkBounds(pos)) {
			System.out.println("Incorrect position");
			return null;
		}
		
		int row = pos.row - 1;
		int col = pos.col.getIndex();
		
		return board[row][col];
	}
	
	protected void setPieceAt(Position pos, Piece p) {
		if (!checkBounds(pos)) {
			System.out.println("Incorrect position");
			return;
		}
	
		int col = pos.col.getIndex();
		int row = pos.row - 1;
	
		board[row][col] = p;
	}
	
	public boolean checkBounds(Position pos) {
		if(pos == null || pos.col == null) return false;
		
		int row = pos.row - 1;
		int col = pos.col.getIndex();
		
		if(row>7 || row<0 || col>7 || col<0) return false;
		
		return true;
	}
}
