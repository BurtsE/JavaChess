public class Pawn extends ChessPiece {

    public Pawn(String color) {
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
        if (color.equals("White")) {
            if (line == 1) {
                return Math.abs(toColumn - column) <= 1 && (1 <= toLine - line && toLine - line <= 2);
            }
            return Math.abs(toColumn - column) <= 1 && (toLine - line == 1);
        }
        if (color.equals("Black")) {
            if (line == 6) {
                return Math.abs(toColumn - column) <= 1 && (1 <= line - toLine && line - toLine <= 2);
            }
            return Math.abs(toColumn - column) <= 1 && (line - toLine == 1);
        }
        throw new RuntimeException("unknown color");
    }

    @Override
    public String getSymbol() {
        return "P";
    }

}
