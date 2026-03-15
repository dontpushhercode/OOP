package lab2;
//p:2
public class Bishop extends Piece {
	
	public Bishop(boolean isWhite) {
		super(isWhite);
	}
	
	public Bishop() {
		super();
	}

	@Override
	protected boolean isLegalMove(Position b, Board board) { //check logic (dx==dy), check path
		int dy = dy(a, b);
		int dx = dx(a, b);
		
		if(Math.abs(dx)!=Math.abs(dy)) return false;
		
		return isPathClear(b, board);
	}
}
