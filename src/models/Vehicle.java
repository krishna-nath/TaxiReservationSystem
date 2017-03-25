/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author krishna
 */
public class Vehicle {
    
    private String type;
    private String name, number, daily_from, daily_to;
    private String   available_from, available_to;
    
    

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDaily_from() {
        return daily_from;
    }

    public void setDaily_from(String daily_from) {
        this.daily_from = daily_from;
    }

    public String getDaily_to() {
        return daily_to;
    }

    public void setDaily_to(String daily_to) {
        this.daily_to = daily_to;
    }

    public String getAvailable_from() {
        return available_from;
    }

    public void setAvailable_from(String available_from) {
        this.available_from = available_from;
    }

    public String getAvailable_to() {
        return available_to;
    }

    public void setAvailable_to(String available_to) {
        this.available_to = available_to;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    
    
    
    
    
}
