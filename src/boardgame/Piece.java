package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    private Piece[][] possibleMoves() {
        return null;
    }

    private boolean possibleMove(Position position) {
        return false;
    }

    private boolean isThereAnyPossibleMove() {
        return true;
    }
}
