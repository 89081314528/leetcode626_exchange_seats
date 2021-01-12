package ru.julia.leetcode626_exchange_seats.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.julia.leetcode626_exchange_seats.dto.ExchangeSeat;
import ru.julia.leetcode626_exchange_seats.servise.SeatService;

import java.util.List;

/**
 * +---------+---------+
 * |    id   | student |
 * +---------+---------+
 * |    1    | Abbot   |
 * |    2    | Doris   |
 * |    3    | Emerson |
 * |    4    | Green   |
 * |    5    | Jeames  |
 * +---------+---------+
 * Mary wants to change seats for the adjacent students.
 * +---------+---------+
 * |    id   | student |
 * +---------+---------+
 * |    1    | Doris   |
 * |    2    | Abbot   |
 * |    3    | Green   |
 * |    4    | Emerson |
 * |    5    | Jeames  |
 * +---------+---------+
 * If the number of students is odd, there is no need to change the last one's seat.
 */
@RestController
public class Leetcode626ExcangeSeatsController {

    SeatService seatService;

    public Leetcode626ExcangeSeatsController(SeatService seatService) {
        this.seatService = seatService;
    }

    @RequestMapping("/exchangeSeats")
    public List<ExchangeSeat> exchangeSeats() {
        return seatService.exchangeSeats();
    }
}
