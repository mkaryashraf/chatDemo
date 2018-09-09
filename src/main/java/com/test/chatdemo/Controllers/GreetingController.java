/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.chatdemo.Controllers;

import org.springframework.stereotype.Controller;
import com.test.chatdemo.Domain.*;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.util.HtmlUtils;


/**
 *
 * @author Makary Ashraf
 */
@Controller
public class GreetingController {
    
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message)throws Exception{
        return new Greeting("Hello, "+HtmlUtils.htmlEscape(message.getName())+"!");
    }  
    
}
