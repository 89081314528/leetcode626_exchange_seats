package ru.julia.leetcode626_exchange_seats.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julia.leetcode626_exchange_seats.entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
