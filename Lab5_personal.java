/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5_personal;

/**
 *
 * @author TUF
 */
public class Lab5_personal {

    public static void main(String[] args) {
        
        MaintenanceRequest request1 = MaintenanceRequestFactory.createMaintenanceRequest(1, "Leaky faucet", "low");
        request1.processRequest();
        System.out.println("Request ID: " + request1.getRequestId() + ", Priority: " + request1.getPriority() + ", Status: " + request1.getStatus() + ", Expire Date: " + request1.getExpireDate());

        MaintenanceRequest request2 = MaintenanceRequestFactory.createMaintenanceRequest(2, "Broken window", "medium");
        request2.processRequest();
        System.out.println("Request ID: " + request2.getRequestId() + ", Priority: " + request2.getPriority() + ", Status: " + request2.getStatus() + ", Expire Date: " + request2.getExpireDate());

        MaintenanceRequest request3 = MaintenanceRequestFactory.createMaintenanceRequest(3, "Gas leak", "high");
        request3.processRequest();
        System.out.println("Request ID: " + request3.getRequestId() + ", Priority: " + request3.getPriority() + ", Status: " + request3.getStatus() + ", Expire Date: " + request3.getExpireDate());
    }
}

    

