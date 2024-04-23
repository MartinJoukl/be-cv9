package com.example.be.Controller;

import com.example.be.Repository.Room;
import com.example.be.Repository.RoomRepository;
import com.example.be.Service.RoomService;
import com.example.be.dto.CreateRoomDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping("createRoom")
    @CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
    public Room createRoom(@RequestBody CreateRoomDto createRoomDto) {
        return roomService.createRoom(createRoomDto.getRoomName());
    }

    @GetMapping("getRoom")
    @CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
    public Room getRoom(@RequestParam String roomName) {
        Optional<Room> roomOptional = roomService.getRoom(roomName);
        if (roomOptional.isEmpty()) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Room not found"
            );
        }
        return roomOptional.get();
    }

    @GetMapping("listRooms")
    @CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
    public List<Room> listRooms() {
        return roomService.listRooms();
    }
}
