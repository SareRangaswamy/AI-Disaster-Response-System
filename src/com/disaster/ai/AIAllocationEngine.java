package com.disaster.ai;

import com.disaster.model.EmergencyRequest;

public class AIAllocationEngine {

    public void analyzeRequest(EmergencyRequest request) {

        if(request.getSeverity() >= 8) {
            System.out.println("HIGH PRIORITY RESPONSE REQUIRED");
        } else if(request.getSeverity() >= 5) {
            System.out.println("MEDIUM PRIORITY RESPONSE");
        } else {
            System.out.println("LOW PRIORITY RESPONSE");
        }
    }
}