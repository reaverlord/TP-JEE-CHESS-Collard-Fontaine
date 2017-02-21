package org.isen.bootstrap.core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Romain on 09/01/2017.
 */
public class DameBoard {
        private List<List<Cell>> board;
        private List<Turn> turns;
        private int ROWS = 9;
        private int COLS = 9;


    public DameBoard() {
        this.board = new ArrayList<>(ROWS);
        this.turns = new LinkedList<>();
        for (int rowIndex=0; rowIndex < ROWS; rowIndex++) {
            ArrayList<Cell> row = new ArrayList<>(COLS);
            for (int colIndex = 0; colIndex < COLS; colIndex++) {
                row.add(new Cell(rowIndex, colIndex ));
            }
            this.board.add(row);
        }
    }

    private void initializeColor(int rowStart, int rowEnd, Chip.ChipColor color) {
        for (int rowIndex=rowStart; rowIndex <= rowEnd; rowIndex++) {
            for (int colIndex=0; colIndex <= COLS; colIndex++) {
                if (rowIndex % 2 == 0) {
                    if (colIndex % 2 == 0) {
                            setChip(rowIndex, colIndex, new Chip(color, Chip.ChipType.CHIP));

                    }
                } else {
                    if (colIndex % 2 == 1) {

                            setChip(rowIndex, colIndex, new Chip(color, Chip.ChipType.CHIP));

                    }
                }
            }
        }
    }

    public void initialize() {
        initializeColor(1, 4, Chip.ChipColor.WHITE);
        initializeColor(7, 10, Chip.ChipColor.BLACK);
    }


    public Cell getCell(int row, int col)  {

        return this.board.get(row - 1).get(col - 1);
    }

    public void setCell(int row, int col, Cell cell) {
        this.board.get(row - 1).set(col - 1, cell);
    }

    public boolean hasChip(int row, int col) {
        return getCell(row, col).hasChip();
    }

    public Chip getChip(int row, int col) throws CellEmptyException {
        return getCell(row, col).getChip();
    }

    public void setChip(int row, int col, Chip chip)  {
        getCell(row, col).setChip(chip);
    }







}

