package com.ogawaprojects.application;

import com.ogawaprojects.chess.ChessMatch;
import com.ogawaprojects.chess.ChessPiece;
import com.ogawaprojects.chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();


        while (true) {
            UI.printBoard(chessMatch.getPieces()); // UI: User Interface
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}