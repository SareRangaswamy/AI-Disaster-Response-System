package com.disaster.main;

import com.disaster.model.FloodZone;
import com.disaster.model.MedicalRequest;
import com.disaster.ai.AIAllocationEngine;

public class Main {

    public static void main(String[] args) {

        MedicalRequest request =
                new MedicalRequest(
                        "Flood",
                        9,
                        200,
                        75
                );

        request.displayRequest();

        AIAllocationEngine ai = new AIAllocationEngine();
        ai.analyzeRequest(request);

        FloodZone floodZone = new FloodZone("Switzerland");

        floodZone.showAlert();
    }
}