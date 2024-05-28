/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_personal;

/**
 *
 * @author TUF
 */
public class MaintenanceRequestFactory {

    public static MaintenanceRequest createMaintenanceRequest(int requestId, String description, String priority) {
        switch (priority.toLowerCase()) {
            case "low":
                return new LowPriorityRequest(requestId, description);
            case "medium":
                return new MediumPriorityRequest(requestId, description);
            case "high":
                return new HighPriorityRequest(requestId, description);
            default:
                throw new IllegalArgumentException("Invalid priority level");
        }
    }
}
