package org.isen.bootstrap.core;

/**
 * Created by dmetzler on 03/09/2014.
 */
public interface DameGame {


	/**
	 * Play a chip in a given column.
	 * @param colour
	 * @param column
	 * @throws GameException if it is not allowed to play in that cell.
	 */
    void play(ChipColour colour, int column) throws GameException;

    /**
     * Returns the colour of the chip in a given cell, null if no
     * chip is present.
     * @param column
     * @param row
     * @return
     */
    ChipColour getCell(int column, int row);

}
