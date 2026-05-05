package com.disaster.model;

public class FloodZone extends DisasterZone {

    public FloodZone(String zoneName) {
        super(zoneName);
    }

    @Override
    public void showAlert() {
        System.out.println("Flood Alert in Zone: " + zoneName);
    }
}