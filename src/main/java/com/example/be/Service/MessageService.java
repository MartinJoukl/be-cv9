package com.example.be.Service;

import com.example.be.Repository.Message;
import com.example.be.Repository.MessageRepository;
import com.example.be.Repository.Room;
import com.example.be.dto.MessageDto;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;

@Service
public class MessageService {
    private final MessageRepository messageRepository;
    private final RoomService roomService;

    public MessageService(MessageRepository messageRepository, RoomService roomService) {
        this.messageRepository = messageRepository;
        this.roomService = roomService;
    }
    public Message sendMessage(MessageDto messageDto) {
        // Very safe
        Room room = roomService.getRoom(messageDto.getRoomName()).get();
        Message message = new Message();
        message.setRoom(room);
        message.setSendingTimestamp(ZonedDateTime.now());
        message.setSenderName(messageDto.getSender());
        message.setMessageText(messageDto.getMessageText());
        return messageRepository.save(message);
    }

    public List<Message> listByRoomName(String roomName){
        return messageRepository.findMessagesByRoomName(roomName);
    }
}
