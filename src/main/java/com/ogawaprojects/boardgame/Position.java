package com.ogawaprojects.boardgame;

public class Position {

    private int rown;
    private int column;

    public Position(int rown, int column) {
        this.rown = rown;
        this.column = column;
    }

    public int getRown() {
        return rown;
    }

    public void setRown(int rown) {
        this.rown = rown;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return rown + ", " + column;
    }
}
