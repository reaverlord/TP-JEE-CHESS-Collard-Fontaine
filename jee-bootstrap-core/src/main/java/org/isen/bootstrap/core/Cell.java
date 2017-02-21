package org.isen.bootstrap.core;

/**
 * Created by Romain on 21/02/2017.
 */
public class Cell {
    private Chip chip;
    private int row ;
    private int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Cell(Chip chip, int row, int col) {
        this.chip = chip;
        this.row = row;
        this.col = col;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    public boolean hasChip() {
        return this.chip != null;
    }
}
