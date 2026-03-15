package lab2;
//p:2
public class Knight extends Piece {
	
	public Knight(boolean isWhite) {
		super(isWhite);
	}
	
	public Knight() {
		super();
	}
	
	
	@Override
	protected boolean isLegalMove(Position b, Board board) { //check if taken, check logic (2|1)
		int dy = Math.abs(dy(a, b));
		int dx = Math.abs(dx(a, b));
		
		Piece target = board.getPieceAt(b);
		
		if(target != null && target.isWhite == this.isWhite) return false;
		return ((dx == 2 && dy == 1) || (dx == 1 && dy == 2));
	}
}
