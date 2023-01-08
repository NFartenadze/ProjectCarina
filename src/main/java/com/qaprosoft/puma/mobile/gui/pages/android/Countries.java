package com.qaprosoft.puma.mobile.gui.pages.android;

public enum Countries {
    UNITED_STATES("United States"),
    ARGENTINA("Argentina"),
    GERMANY("Germany"),
    FRANCE("France");

    private String country;

    Countries(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
