package com.example.be.Controller;

import com.example.be.Repository.Message;
import com.example.be.Service.MessageService;
import com.example.be.dto.MessageDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessageController {

    private MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("sendMessage")
    public Message sendMessage(@RequestBody MessageDto messageDto) {
        return messageService.sendMessage(messageDto);
    }

    @GetMapping("listByRoomName")
    public List<Message> listByRoomName(@RequestParam String roomName) {
        return messageService.listByRoomName(roomName);
    }
}
