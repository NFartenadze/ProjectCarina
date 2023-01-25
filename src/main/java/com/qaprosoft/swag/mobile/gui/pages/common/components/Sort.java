package com.qaprosoft.swag.mobile.gui.pages.common.components;

public enum Sort {
    NAME_A_TO_Z("A to Z"),
    NAME_Z_TO_A("Z to A"),
    PRICE_LOW_TO_HIGH("low to high"),
    PRICE_HIGH_TO_LOW("high to low");

    private String by;

    Sort(String by) {
        this.by = by;
    }

    public String getBy() {
        return by;
    }
}
