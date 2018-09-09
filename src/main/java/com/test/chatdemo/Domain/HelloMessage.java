/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.chatdemo.Domain;

import java.io.Serializable;

/**
 *
 * @author Makary Ashraf
 */
public class HelloMessage implements Serializable {
    
   private String name;

    public HelloMessage(String name) {
        this.name = name;
    }
    public HelloMessage() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
   
   
    
}
