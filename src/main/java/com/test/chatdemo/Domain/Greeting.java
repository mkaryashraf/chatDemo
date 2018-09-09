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
public class Greeting implements Serializable {
    private String content;

    public Greeting(){
    }

    public Greeting(String content) {
        this.content = content;
    }
    

    
    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
   
    
    
}
