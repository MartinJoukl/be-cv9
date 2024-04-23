package com.example.be.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {
    //@Query("SELECT Room FROM Room r where r.roomName = :roomName")
    Optional<Room> findByRoomName(@Param("roomName") String roomName);
}
