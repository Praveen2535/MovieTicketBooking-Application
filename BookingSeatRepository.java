package com.example.springcleanarchitecture.repository;

import com.example.springcleanarchitecture.entity.BookingSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingSeatRepository extends JpaRepository<BookingSeat, Long> {
}
