package org.isen.bootstrap.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Romain on 09/01/2017.
 */
public class DameBoard {
    public static final int caseNumber= 9;
    public int numberOfChip = 1;

    List<List<ChipColour>> board = new ArrayList<>(caseNumber);

    public void DameGameImpl(){
        initBoard();
    }

    private void initBoard() {
        for (int i = 0; i < caseNumber; i++){
            board.add(new ArrayList<ChipColour>(caseNumber));
        }
    }


}
