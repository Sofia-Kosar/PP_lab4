package com.example.lab4.hotel.managment.repository;

import com.example.lab4.hotel.managment.entity.apartment.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
