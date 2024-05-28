/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_personal;

/**
 *
 * @author TUF
 */


import java.time.LocalDate;

public class MediumPriorityRequest extends MaintenanceRequest {

    public MediumPriorityRequest(int requestId, String description) {
        super(requestId, description);
        setPriority();
        setStatus();
        setExpire();
    }

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void setExpire() {
        this.expireDate = LocalDate.now().plusMonths(1);
    }

    @Override
    public void processRequest() {
        System.out.println("Request accepted, estimated completion date is " + expireDate);
    }
}

