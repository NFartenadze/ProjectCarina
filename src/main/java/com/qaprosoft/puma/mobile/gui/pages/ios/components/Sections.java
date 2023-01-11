package com.qaprosoft.puma.mobile.gui.pages.ios.components;

public enum Sections {
    NEW_ARRIVALS("New Arrivals"),
    WOMEN("Women"),
    MEN("Men"),
    KIDS("Kids"),
    COLLAB("Collaborations"),
    SPORT("Sport"),
    SALE("Sale");

    private String section;

    Sections(String section) {
        this.section = section;
    }

    public String getSection() {
        return section;
    }
}