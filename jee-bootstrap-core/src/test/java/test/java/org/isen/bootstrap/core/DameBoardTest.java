package org.isen.bootstrap.core;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Romain on 09/01/2017.
 */
public class DameBoardTest {

    private DameBoard dameBoardTest;

    @Before
    public void init(){
        dameBoardTest = new DameBoard();
    }

    @Test
    public void testInitialiseColor(){
        dameBoardTest.initialize();
        for (int i=0; i<=9; i++ ){
            for(int j=0; j<=9; j++){

            }
        }
    }

    @Test
    public void testPromoteToQueen() throws IllegalMoveException {
        Chip testChip = new Chip(Chip.ChipColor.WHITE, Chip.ChipType.CHIP);
        this.dameBoardTest.getCell(8,2).setChip(testChip);
        this.dameBoardTest.playTurn(8,2,9,3);
        assertEquals(testChip.getChipType(), Chip.ChipType.QUEEN);
    }

    @Test
    public void testPromoteToBlackQueen() throws IllegalMoveException{
        Chip testChip = new Chip(Chip.ChipColor.BLACK, Chip.ChipType.CHIP);
        this.dameBoardTest.getCell(2,4).setChip(testChip);
        this.dameBoardTest.playTurn(2,4,1,3);
        assertEquals(testChip.getChipType(), Chip.ChipType.QUEEN);
    }

    @Test
    public void whiteQueenCanGoBackwards() throws BoardBoundsException, IllegalMoveException, CellEmptyException {
        this.dameBoardTest.setChip(10, 2, new Chip(Chip.ChipColor.WHITE, Chip.ChipType.QUEEN));
        this.dameBoardTest.playTurn(10, 2, 9, 3);
        assertEquals(this.dameBoardTest.getChip(9, 3).getChipType(), Chip.ChipType.QUEEN);
        assertEquals(this.dameBoardTest.getChip(9, 3).getChipColor(), Chip.ChipColor.WHITE);
        this.dameBoardTest.playTurn(9, 3, 7, 5);
        assertEquals(this.dameBoardTest.getChip(7, 5).getChipColor(), Chip.ChipColor.WHITE);
        assertEquals(this.dameBoardTest.getChip(7, 5).getChipType(), Chip.ChipType.QUEEN);
    }
    @Test
    public void testGetCell(){
        assertNotEquals(this.dameBoardTest.getCell(0,0),null);
    }

    @Test
    public void testSetCell(){
        Cell testCell = new Cell(0,0);
        this.dameBoardTest.setCell(2,2,testCell);
        assertNotEquals(this.dameBoardTest.getCell(2,2),null);
    }

    @Test
    public void testGetChip(){
        Chip testChip = new Chip(Chip.ChipColor.BLACK, Chip.ChipType.CHIP);
        Cell testCell = new Cell(testChip,1,1);
        this.dameBoardTest.setCell(1,1,testCell);
        assertNotEquals(testCell.getChip(),null);
    }

    @Test
    public void testSetChip(){
        Chip testChip = new Chip(Chip.ChipColor.BLACK, Chip.ChipType.CHIP);
        Cell testCell = new Cell(1,1);
        this.dameBoardTest.setCell(1,1,testCell);
        this.dameBoardTest.getCell(1,1).setChip(testChip);
        assertNotEquals(this.dameBoardTest.getCell(1,1).getChip(),null);
    }

    @Test
    public void testhaschip(){
        this.dameBoardTest.setChip(1,1, new Chip(Chip.ChipColor.BLACK, Chip.ChipType.CHIP));
        assertTrue(this.dameBoardTest.hasChip(1,1));
    }
}
