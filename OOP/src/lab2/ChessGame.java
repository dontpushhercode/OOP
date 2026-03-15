package lab2;
//p:2
public class ChessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board board = new Board();
		
		Pawn whitePawn = new Pawn(true);
		Bishop whiteBishop = new Bishop(true);
		Queen blackQueen = new Queen(false);
		
		board.addPiece(whitePawn, new Position(2, Column.E));
		board.addPiece(blackQueen, new Position(8, Column.D));
		board.addPiece(whiteBishop, new Position(4, Column.D));
		
		blackQueen.move(new Position(2, Column.E), board);
		blackQueen.move(new Position(4, Column.D), board);
		
	}

}
