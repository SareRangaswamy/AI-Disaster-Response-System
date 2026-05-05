package com.disaster.model;

public class MedicalRequest extends EmergencyRequest {

    private int injuredPeople;

    public MedicalRequest(String requestType,
                          int severity,
                          int peopleAffected,
                          int injuredPeople) {

        super(requestType, severity, peopleAffected);
        this.injuredPeople = injuredPeople;
    }

    public int getInjuredPeople() {
        return injuredPeople;
    }

    @Override
    public void displayRequest() {

        super.displayRequest();

        System.out.println("Injured People: " + injuredPeople);
    }
}