package com.ogawaprojects.boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        //Position definido automaticamente pelo Java como null
    }

    protected Board getBoard() { //somente a camada de tabuleiro e subclasses vai ter acesso
        return board;
    }
}
