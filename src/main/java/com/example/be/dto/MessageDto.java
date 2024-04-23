package com.example.be.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class MessageDto {
    private String sender;
    private String messageText;
    private String roomName;
}
