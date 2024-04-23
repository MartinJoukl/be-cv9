package com.example.be.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    @Query("SELECT m from Message m JOIN Room r on m.room = r")
    List<Message> findMessagesByRoomName(@Param("roomName") String roomName);
}
