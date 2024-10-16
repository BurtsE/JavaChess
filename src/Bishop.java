public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (super.invalidField(chessBoard, line, column, toLine, toColumn)) {
            return false;
        }
        if (!(Math.abs(line - toLine) == Math.abs(column - toColumn) && line - toLine != 0)) {
            return false;
        }
        for (int i = line; i <= toLine; i += (int)Math.signum(line - toLine)) {
            for (int j = column; j <= toColumn; j += (int)Math.signum(column - toColumn)) {
                if (chessBoard.board[i][j] != null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String getSymbol() {
        return "B";
    }

}
