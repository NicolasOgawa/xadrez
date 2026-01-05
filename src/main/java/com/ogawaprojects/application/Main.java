package com.ogawaprojects.application;

import com.ogawaprojects.boardgame.Board;
import com.ogawaprojects.boardgame.Position;
import com.ogawaprojects.chess.ChessMatch;

public class Main {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoar(chessMatch.getPieces()); // UI: User Interface
    }
}