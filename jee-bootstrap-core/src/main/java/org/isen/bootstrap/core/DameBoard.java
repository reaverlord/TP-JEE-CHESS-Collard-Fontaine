package org.isen.bootstrap.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Romain on 09/01/2017.
 */
public class DameBoard implements DameGame{

    public static final int caseNumber= 9;
    public int numberOfChip = 1;
    public static final String OUTSIDE_OF_BOARD_ERROR = "It is not possible to play outside of the board";

    List<List<ChipColour>> board = new ArrayList<>(caseNumber);

    public DameBoard(){
        initBoard();
    }

    private void initBoard() {
        for (int i = 0; i < caseNumber; i++){
            board.add(new ArrayList<ChipColour>(caseNumber));
        }
    }

    @Override
    public void play(ChipColour colour, int column) {
        if (column > caseNumber - 1) {
            throw new GameException(OUTSIDE_OF_BOARD_ERROR);
        }
        List<ChipColour> col = board.get(column);
        if (col.size() >= caseNumber) {
            throw new GameException(OUTSIDE_OF_BOARD_ERROR);
        }
        col.add(colour);
    }

    @Override
    public ChipColour getCell(int i, int j) {
        if (i < 0 || i >= caseNumber) {
            return null;
        }
        List<ChipColour> column = board.get(i);
        return j < column.size() && j >= 0 ? column.get(j) : null;
    }
}
