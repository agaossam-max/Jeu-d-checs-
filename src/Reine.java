class Reine extends Piece {

    boolean isValidMove(Position newPosition) {


        boolean horizontalOuVertical = (newPosition.column == this.column || newPosition.row == this.row);


        boolean diagonale = Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row);


        if (horizontalOuVertical || diagonale) {
            return true;
        } else {
            return false;
        }
    }
}