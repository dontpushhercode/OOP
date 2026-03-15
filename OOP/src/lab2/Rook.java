package lab2;
//p:2
public class Rook extends Piece {
	
	public Rook(boolean isWhite) {
		super(isWhite);
	}
	
	public Rook() {
		super();
	}
	
	@Override
	protected boolean isLegalMove(Position b, Board board) { //check logic (only one dir), check path
		int dy = dy(a, b);
		int dx = dx(a, b);
		
		if(dx != 0 && dy != 0) return false;
		
		return isPathClear(b, board);
	}
}
