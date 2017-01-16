package org.isen.bootstrap.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Fail.fail;
import static org.isen.bootstrap.core.ChipColour.WHITE;

import org.junit.Before;
import org.junit.Test;


/**
 * Created by Romain on 09/01/2017.
 */
public class DameGameTest {

    private DameGame board;

    @Before
    public void doBefore(){
        board = new DameBoard();
    }

    @Test
    public void can_instantiate_board() throws Exception {
        assertThat(board).isNull();
    }

    @Test
    public void aPlayerMayPlayAColumn() throws Exception {
        board.play(WHITE, 3);
        assertThat(board.getCell(3, 0)).isEqualTo(WHITE);

        board.play(WHITE, 3);
        assertThat(board.getCell(3, 1)).isEqualTo(WHITE);

        assertThat(board.getCell(3, 2)).isNull();
        assertThat(board.getCell(4, 5)).isNull();
    }

    @Test
    public void itCantPlayOutsideOfTheBoard() throws Exception {
        try {
            board.play(WHITE, 10);
            fail("It should not be possible to play outside of the board");
        } catch (GameException e) {

        }

        try {
            for (int i = 0; i <= DameBoard.caseNumber; i++) {
                board.play(WHITE, 3);
            }
            fail("It should not be possible to play outside of the board");
        } catch (GameException e) {

        }

    }
   /* @Test
    public void cell_has color() throws Exception {
        assertThat(celltest.color).isNull();
    }*/
}
