/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.chatdemo.Controllers;

import com.test.chatdemo.Domain.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Makary Ashraf
 */
@Controller
public class ChatController {
    
    @MessageMapping("/sendMsg")
    @SendTo("/topic/sendMsg")
    public ChatMessage sendChatMessage(@Payload ChatMessage chatMessage){
        return chatMessage;
    }
    
    @MessageMapping("/addUser")
    @SendTo("/topic/sendMsg")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor){
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    } 
    
}
