package lab2;

public class King extends Piece {
	
	public King(boolean isWhite) {
		super(isWhite);
	}
	
	public King() {
		super();
	}
	
	@Override
	public boolean isLegalMove(Position b, Board board) { //check if taken, check logic (at least 1 cell)
		int dx = Math.abs(dx(a,b));
		int dy = Math.abs(dy(a,b));
		
		Piece target = board.getPieceAt(b);
		if(target!=null && target.isWhite==this.isWhite) return false;
		return(dx<=1 && dy<=1 && (dx!=0 || dy!=0));
	}
}
