package com.example.springcleanarchitecture.repository;

import com.example.springcleanarchitecture.entity.Seat;
import com.example.springcleanarchitecture.entity.SeatStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findByEventIdAndStatus(Long eventId, SeatStatus status);
    List<Seat> findByEventIdAndIdIn(Long eventId, List<Long> seatIds);
    void deleteByEventId(Long eventId);
}
