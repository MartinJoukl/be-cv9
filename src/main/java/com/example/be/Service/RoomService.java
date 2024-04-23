package com.example.be.Service;

import com.example.be.Repository.Room;
import com.example.be.Repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room createRoom(String roomName) {
        Room room = new Room();
        room.setRoomName(roomName);
        return roomRepository.save(room);
    }

    public Optional<Room> getRoom(String roomName) {
        Room room = new Room();
        room.setRoomName(roomName);
        return roomRepository.findByRoomName(roomName);
    }

    public List<Room> listRooms() {
        return roomRepository.findAll();
    }
}
