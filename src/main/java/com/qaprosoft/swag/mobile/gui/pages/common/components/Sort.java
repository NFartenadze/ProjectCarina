package com.qaprosoft.swag.mobile.gui.pages.common.components;

public enum Sort {
    NAME_A_TO_Z("Name (A to Z)"),
    NAME_Z_TO_A("Name (Z to A)"),

    PRICE_LOW_TO_HIGH("Price (low to high)"),
    PRICE_HIGH_TO_LOW("Horizontal scroll bar, 2 pages");

    private String by;

    Sort(String by) {
        this.by = by;
    }

    public String getBy() {
        return by;
    }
}
