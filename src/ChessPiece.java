public abstract class ChessPiece {
    String color;
    boolean check;

    public ChessPiece(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public abstract String getSymbol();

    protected boolean invalidField(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (line < 0 || line > 7 || column < 0 || column > 7) {
            return true;
        }
        if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return true;
        }
        if (line == toLine && column == toColumn) {
            return true;
        }
        ChessPiece piece = chessBoard.board[toLine][toColumn];
        return piece != null && piece.getColor().equals(this.getColor());
    }
}
