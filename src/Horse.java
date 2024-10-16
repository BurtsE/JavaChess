public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }
    public String getColor() {
        return super.getColor();
    }
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (super.invalidField(chessBoard, line, column, toLine, toColumn) ||
                super.busy(chessBoard, line, column, toLine, toColumn)) {
            return false;
        }
        return Math.abs(toColumn - column) + Math.abs(toLine - line) == 3;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
