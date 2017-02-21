package org.isen.bootstrap.core;

/**
 * Created by Romain on 09/01/2017.
 */

public class Chip {
    public enum ChipColor {
        WHITE, BLACK
    }

    public enum ChipType {
        QUEEN, CHIP
    }

    private ChipColor chipColor;
    private ChipType  chipType;

    public Chip(ChipColor chipColor, ChipType chipType) {
        this.chipColor = chipColor;
        this.chipType = chipType;
    }

    public ChipColor getChipColor() {
        return chipColor;
    }

    public void setChipColor(ChipColor chipColor) {
        this.chipColor = chipColor;
    }

    public ChipType getChipType() {
        return chipType;
    }

    public void setChipType(ChipType chipType) {
        this.chipType = chipType;
    }
}