package com.ogawaprojects.pieces;

import com.ogawaprojects.boardgame.Board;
import com.ogawaprojects.chess.ChessPiece;
import com.ogawaprojects.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
