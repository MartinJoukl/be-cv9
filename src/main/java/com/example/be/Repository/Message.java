package com.example.be.Repository;

import jakarta.persistence.*;
import lombok.Data;

import java.time.ZonedDateTime;

@Entity
@Data
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String senderName;

    @Column
    private String messageText;

    @Column
    private ZonedDateTime sendingTimestamp;

    @ManyToOne(cascade = CascadeType.ALL)
    private Room room;
}
