public class Rook extends ChessPiece {
    public Rook(String color) {
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
        if (line == toLine) {
            for (int c = column; c < toColumn; c++) {
                if (chessBoard.board[line][c] != null) {
                    return false;
                }
            }
            return true;
        } else if (column == toColumn) {
            for (int l = line; l < toLine; l++) {
                if (chessBoard.board[l][column] != null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
