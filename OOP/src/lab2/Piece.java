package lab2;
//p:2
public abstract class Piece {
	protected Position a;
	protected boolean isWhite;
	//constructors
	public Piece() {
		
	}
	
	public Piece(boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	//methods
	protected abstract boolean isLegalMove(Position b, Board board);
	
	protected void move(Position b, Board board) {
		if(isLegalMove(b, board)) {
			board.setPieceAt(a, null);
			board.setPieceAt(b, this);
			this.a = b;
			System.out.println("Moved!");
		}
		else System.out.println("Illegal move");
	}
	
	protected boolean isPathClear(Position b, Board board) { //check all cells [A;B]
		int dx = dx(a, b);
		int dy = dy(a, b);
		
		int rowDir = Integer.signum(dy);
		int colDir = Integer.signum(dx);
		
		int curRow = a.row + rowDir;
		int curCol = a.col.getIndex() + colDir;
		
		while(curRow != b.row || curCol != b.col.getIndex()) {
			if(board.getPieceAt(new Position(curRow, Column.getColumn(curCol)))!= null) {
				return false;
			}
			curRow+=rowDir;
			curCol+=colDir;
		}
		
		Piece target = board.getPieceAt(b);
		if(target != null && target.isWhite == this.isWhite) return false;
		
		return true; 
	}
	
	protected static int dx(Position a, Position b) {
		return b.col.getIndex() - a.col.getIndex();
	}
	
	protected static int dy(Position a, Position b) {
		return b.row - a.row;
	}
}
