/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_personal;
import java.time.LocalDate;

/**
 *
 * @author TUF
 */




import java.time.LocalDate;

public class LowPriorityRequest extends MaintenanceRequest {

    public LowPriorityRequest(int requestId, String description) {
        super(requestId, description);
        setPriority();
        setStatus();
        setExpire();
    }

    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }

    @Override
    public void setExpire() {
        this.expireDate = LocalDate.now();
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }
}
