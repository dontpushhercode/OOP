package lab2;
//p:2
public class Pawn extends Piece {
	private boolean isFirstMove = true;
	
	public Pawn(boolean isWhite) {
		super(isWhite);
	}
	
	public Pawn() {
		super();
	}
	
	@Override
	protected boolean isLegalMove(Position b, Board board) { //find direction, check if taken, check if dx!=0, check if first move
		int direction = isWhite?1:-1;
		int dy = dy(a, b);
		
		if(board.getPieceAt(b)!=null) return false;
		if(dx(a, b)!=0) return false;
		
		if(isFirstMove) {
			return dy == direction || dy == 2*direction;
		}
		
		return dy == direction;
	}
	
	@Override
	public void move(Position b, Board board) {
		if(isLegalMove(b, board)) {
			board.setPieceAt(a, null);
			board.setPieceAt(b, this);
			this.a = b;
			this.isFirstMove = false;
		}
		else System.out.println("Illegal move");
	}
}
