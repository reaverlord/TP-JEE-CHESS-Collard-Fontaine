package test.java.org.isen.bootstrap.core;

import org.isen.bootstrap.core.Cell;
import org.isen.bootstrap.core.Chip;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Romain on 24/02/2017.
 */
public class CellTest {

    private Cell testCell;
    private Chip testChip;



    @Before
    public void init(){
        testChip = new Chip(Chip.ChipColor.WHITE, Chip.ChipType.CHIP);
        testCell = new Cell(this.testChip,0,0);
    }

    @Test
    public void testHasChip(){
        assertTrue(this.testCell.hasChip());
    }

    @Test
    public void testSetChip(){
        this.testCell = new Cell(0,0);
        this.testCell.setChip(this.testChip);
        assertTrue(this.testCell.hasChip());
    }

    @Test
    public void testGetChip(){
        this.testCell.setChip(this.testChip);
        assertNotEquals(this.testCell.getChip(),null);
    }

    @Test
    public void testSetRow(){
        this.testCell.setRow(2);
        assertEquals(this.testCell.getRow(),2);
    }

    @Test
    public void testSetCol(){
        this.testCell.setCol(5);
        assertEquals(this.testCell.getCol(),5);
    }

    @Test
    public void testGetRow(){
        this.testCell = new Cell(0,0);
        assertEquals(this.testCell.getRow(),0);
    }

    @Test
    public void testGetCol(){
        this.testCell = new Cell(0,0);
        assertEquals(this.testCell.getCol(),0);
    }
}
