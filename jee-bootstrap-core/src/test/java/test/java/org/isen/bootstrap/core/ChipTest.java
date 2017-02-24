package test.java.org.isen.bootstrap.core;

import org.isen.bootstrap.core.Chip;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Romain on 24/02/2017.
 */
public class ChipTest {

    private Chip chipTestOne;
    private Chip chipTestTwo;
    private Chip chipTestThree;
    private Chip chipTestFour;

    @Before
    public void init() throws Exception{
        chipTestOne = new Chip(Chip.ChipColor.BLACK, Chip.ChipType.CHIP);
        chipTestTwo = new Chip(Chip.ChipColor.WHITE, Chip.ChipType.CHIP);
        chipTestThree = new Chip(Chip.ChipColor.BLACK, Chip.ChipType.QUEEN);
        chipTestFour = new Chip(Chip.ChipColor.WHITE, Chip.ChipType.QUEEN);
    }

    @Test
    public void testGetChipColour() throws Exception{
        assertEquals(this.chipTestOne.getChipColor(), Chip.ChipColor.BLACK);
        assertEquals(this.chipTestFour.getChipColor(), Chip.ChipColor.WHITE);
        assertEquals(this.chipTestTwo.getChipColor(), Chip.ChipColor.WHITE);
        assertEquals(this.chipTestThree.getChipColor(), Chip.ChipColor.BLACK);
    }

    @Test
    public void testGetChipType() throws Exception{
        assertEquals(this.chipTestOne.getChipType(), Chip.ChipType.CHIP);
        assertEquals(this.chipTestTwo.getChipType(), Chip.ChipType.CHIP);
        assertEquals(this.chipTestThree.getChipType(), Chip.ChipType.QUEEN);
        assertEquals(this.chipTestFour.getChipType(), Chip.ChipType.QUEEN);
    }

    @Test
    public void testSetChipColour(){
        this.chipTestOne.setChipColor(Chip.ChipColor.WHITE);
        assertEquals(this.chipTestOne.getChipColor(), Chip.ChipColor.WHITE);
        this.chipTestTwo.setChipColor(Chip.ChipColor.BLACK);
        assertEquals(this.chipTestTwo.getChipColor(), Chip.ChipColor.BLACK);
        this.chipTestThree.setChipColor(Chip.ChipColor.WHITE);
        assertEquals(this.chipTestThree.getChipColor(), Chip.ChipColor.WHITE);
        this.chipTestFour.setChipColor(Chip.ChipColor.BLACK);
        assertEquals(this.chipTestFour.getChipColor(), Chip.ChipColor.BLACK);
    }

    @Test
    public void testSetChipType(){
        this.chipTestOne.setChipType(Chip.ChipType.QUEEN);
        assertEquals(this.chipTestOne.getChipType(), Chip.ChipType.QUEEN);
        this.chipTestTwo.setChipType(Chip.ChipType.QUEEN);
        assertEquals(this.chipTestTwo.getChipType(), Chip.ChipType.QUEEN);
        this.chipTestThree.setChipType(Chip.ChipType.CHIP);
        assertEquals(this.chipTestThree.getChipType(), Chip.ChipType.CHIP);
        this.chipTestFour.setChipType(Chip.ChipType.CHIP);
        assertEquals(this.chipTestFour.getChipType(), Chip.ChipType.CHIP);
    }
}
