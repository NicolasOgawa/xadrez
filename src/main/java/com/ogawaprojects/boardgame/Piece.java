package com.ogawaprojects.boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        //Position definido automaticamente pelo Java como null
    }

    protected Board getBoard() { //somente a camada de tabuleiro e subclasses vai ter acesso
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMoves(Position position) {
        return possibleMoves()[position.getRown()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
