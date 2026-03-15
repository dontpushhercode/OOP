package lab2;

public class Queen extends Piece {
	
	public Queen(boolean isWhite) {
		super(isWhite);
	}
	
	public Queen() {
		super();
	}

	@Override
	protected boolean isLegalMove(Position b, Board board) { //check logic (dx==dy || only one dir), check path
		int dx = dx(a, b);
		int dy = dy(a, b);
		
		if(dx == 0 || dy == 0 || Math.abs(dx) == Math.abs(dy)) {
			return isPathClear(b, board);
		}
		
		return false;
	}
}
