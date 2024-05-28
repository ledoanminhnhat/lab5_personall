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

public class HighPriorityRequest extends MaintenanceRequest {

    public HighPriorityRequest(int requestId, String description) {
        super(requestId, description);
        setPriority();
        setStatus();
        setExpire();
    }

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public void setExpire() {
        this.expireDate = LocalDate.now();
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administrator will contact you immediately!");
    }
}

