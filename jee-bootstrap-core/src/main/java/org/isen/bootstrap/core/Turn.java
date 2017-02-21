package org.isen.bootstrap.core;

/**
 * Created by Romain on 21/02/2017.
 */
public class Turn {
    private int srcRow;
    private int srcCol;

    private int dstRow;
    private int dstCol;

    public Turn(int srcRow, int srcCol, int dstRow, int dstCol) {
        this.srcRow = srcRow;
        this.srcCol = srcCol;
        this.dstRow = dstRow;
        this.dstCol = dstCol;
    }

    public int getSrcRow() {
        return srcRow;
    }


    public void setSrcRow(int srcRow) {
        this.srcRow = srcRow;
    }

    public int getSrcCol() {
        return srcCol;
    }

    public void setSrcCol(int srcCol) {
        this.srcCol = srcCol;
    }

    public int getDstRow() {
        return dstRow;
    }

    public void setDstRow(int dstRow) {
        this.dstRow = dstRow;
    }

    public int getDstCol() {
        return dstCol;
    }

    public void setDstCol(int dstCol) {
        this.dstCol = dstCol;
    }
}
