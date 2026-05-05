package com.disaster.model;

public abstract class DisasterZone {

    protected String zoneName;

    public DisasterZone(String zoneName) {
        this.zoneName = zoneName;
    }

    public abstract void showAlert();
}